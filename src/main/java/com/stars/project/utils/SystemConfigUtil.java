//package com.stars.project.utils;
//
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.Properties;
//
///**
// * Created by mxy on 2017/7/14.
// */
//
//public class SystemConfigUtil {
//    private static Properties prop = new Properties();
//
//    static{
//        //获取类加载器
//        ClassLoader loader = SystemConfigUtil.class.getClassLoader();
//        //通过类加载器加载指定资源
//        InputStream in = loader.getResourceAsStream("SystemConfig.properties");
//        //从输入流读取属性列表
//        try {
//            prop.load(new InputStreamReader(in, "utf-8"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if(in !=null){
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    public static String getValue(String key){
//        return prop.getProperty(key);
//    }
//    public static  void main(String [] args){
//        String appId = SystemConfigUtil.getValue("ALGORITHM");
//        System.out.println(appId);
//    }
//}
