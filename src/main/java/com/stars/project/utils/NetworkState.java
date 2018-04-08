package com.stars.project.utils;


import lombok.Cleanup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by zhangrui on 2017/12/5.
 * 测试网络是否连接
 */
public class NetworkState implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(NetworkState.class);

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        NetworkState networkState = new NetworkState();
        Thread thread = new Thread(networkState);
        // Java 8之前：
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(System.out::println);
        thread.start();
        //FIXME test java 8 create Thread and start fail
        //new Thread(()-> System.out.println("just test for java 8")).start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            try {
                this.isConnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                //线程休眠3333毫秒
                Thread.sleep(3333);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    //判断网络是否连接,ping返回值为1:正常,0断网,-1异常
    public static Integer isConnect() throws IOException {
        int state = 0;
        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        @Cleanup InputStream is = null;
        @Cleanup InputStreamReader isr = null;
        @Cleanup BufferedReader br = null;
        String line = null;
        StringBuffer sb = null;

        try {
            process = runtime.exec("ping " + "www.baidu.com");
            is = process.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            sb = new StringBuffer();
            while ((line = br.readLine()) != null) {
                sb.append(line);
                logger.info("返回值为:" + line);
            }
          /*  is.close();
            isr.close();
            br.close();*/
            if (null != sb && !sb.toString().equals("")) {
                String logString = "";
                if (sb.toString().indexOf("TTL") > 0) {
                    //网络连接正常
                    logString = "网络连接正常,此时的时间为:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                    logger.info(logString);
                    state = 1;
                } else {
                    //网络连接断开
                    logString = "网络连接断开,此时的时间为:" + new Date();
                    logger.info(logString);
                    state = 0;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            state = -1;
        }
        return state;
    }

    // 获得当前时间
    public String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(new Date());
        return time;
    }

    // 将信息写入日志文件
    /*
    * FIXME writeIntoLog just can be used in win not linux
    * */
    public void writeIntoLog(String logString) {
        File file = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            file = new File("D:\\netWorkState.log");
            if (!file.exists()) {
                file.createNewFile();// 如果不存在该文件，则创建
                String sets = "attrib +H \"" + file.getAbsolutePath() + "\"";
                Runtime.getRuntime().exec(sets);//将日志文件隐藏
            }
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            fw.append(logString + "\r\n");// 换行
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
