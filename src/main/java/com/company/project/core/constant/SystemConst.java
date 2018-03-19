package com.company.project.core.constant;

public class SystemConst {
    /**
     * 数据可以使用
     * 与数据库中state值对应。
     */
    public static final Integer STATE_OK =1;
    /**
     * 数据不可以使用
     * 与数据库中state值对应。
     */
    public static final String STATE_USELESS ="0";

    /**
     * 加密算法
     * 可以用java MessageDigest支持的所有加密方法
     * <li>{@code MD5}</li>
     * <li>{@code SHA-1}</li>
     * <li>{@code SHA-256}</li>
     *
     */

    public static final String ALGORITHM="ALGORITHM";
    /**
     * EXITS_LOGINNAME
     * 登录名已存在，请重新填写！
     */
    public static final String EXITS_LOGINNAME ="EXITS_LOGINNAME";
    /**
     * EXITS_USERCODE
     * 用户代码已存在，请重新填写！
     */
    public static final String EXITS_USERCODE ="EXITS_USERCODE";
    /**
     * EXITS_MACHINE_CODE
     * 常量
     * 设备编号已存在，请重新填写
     */
    public static final String EXITS_MACHINE_CODE ="EXITS_MACHINE_CODE";
    /**
     *EXITS_POST_CODE
     * 常量
     * 邮件代码已存在
     */
    public static final String EXITS_POST_CODE ="EXITS_POST_CODE";
    /**
     * 操作成功 OK
     */
    public static final String OPERATION_OK="操作成功！";
    /**
     * 操作失败 FAIL
     */
    public static final String OPERATION_FAIL="操作失败！";
    /**
     * 部分成功 PART_OK
     *
     */
    public static final String OPERATION_PART_OK="部分操作失败，请重试！";
    /**
     * 出现错误 ERROR
     */
    public static final String OPERATION_ERROER="出现错误，请联系管理员！";
    /**
     * 日志类型
     * 2：系统错误
     */
    public static final String LOG_SYSTEM_ERROR="2";
    /**
     * 日志类型
     * 1：正常
     */
    public static final String LOG_SYSTEM_NORMAL="1";
    /**
     * redis 命名前缀。
     */
    public static final String CONSTANT_REDIS_KEYS = "CONSTANT_REDIS_KEYS";
    /**
     * redis 过期时间（秒）。
     */
    public static final String CONSTANT_REDIS_TTL = "CONSTANT_REDIS_TTL";
    /**
    * EXITS_REPORT_USERID
    * 收件人id已存在，请重新填写
    * */
    public static final String EXITS_REPORT_USERID ="收件人id已存在，请重新填写！";
    /**
    * EXITS_ORGANIZATION
    * 机构变号已存在，请重新填写
    * */
    public static final String EXITS_ORGANIZATION="机构编号已存在，请重新填写！";
    /**
     * 批量删除分隔符
     */
    public static final String SPLIT_CHAR=",";
    /**
     * 登录错误信息
     */
    public static final String MSG_LOGIN_ERROR="请正确填写用户名密码！";
    /**
     * 登录错误次数
     */
    public static final String  LOGIN_ERROR_TIMES="5";
    /**
     * 账号锁定
     */
    public static final String  MSG_LOGIN_LOCKED="账号锁定！";
    /**
     * 用户名不能为空
     */
    public static final String  MSG_LOGIN_USERNAME="用户名不能为空！";
    /**
     * 输入的用户名不正确，请重新输入。
     */
    public static final String  MSG_LOGIN_USERNAME_ERR="输入的用户名不正确，请重新输入。";
    /**
     * 用户默认密码
     */
    public static final String PASSWORD_DEFAULT="PASSWORD_DEFAULT";
    /**
     * 管理员字符串
     */
    public static final String STR_ADMIN="STR_ADMIN";
    /**
     * 字符串为真
     * true
     */
    public static final String STR_TRUE="true";
    /**
     * CHECK_ROLENAME
     * 常量
     * 检查的角色名不能为空
     */
    public static final String CHECK_ROLENAME="CHECK_ROLENAME";
    /**
     * CHECK_ROLENAME
     * 常量
     * 角色名填写不正确
     */
    public static final String ERROR_ROLENAME="ERROR_ROLENAME";
    /**
     * EXIST_ROLENAME
     * 常量
     * 检查的角色名为空
     */
    public static final String EXIST_ROLENAME="EXIST_ROLENAME";
    /**
     * CHECK_ORGNAME
     * 常量
     * 检查的组织机构名不能为空
     */
    public static final String CHECK_ORGNAME="CHECK_ORGNAME";
    /**
     * CHECK_ORGNAME
     * 常量
     * 组织机构名填写不正确
     */
    public static final String ERROR_ORGNAME="ERROR_ORGNAME";
    /**
     * EXIST_ORGNAME
     * 常量
     * 检查的组织机构为空
     */
    public static final String EXIST_ORGNAME="EXIST_ORGNAME";
    /**
     * ERROR_MACUSER
     * 常量
     * 检查的组织机构为空
     */
    public static final String ERROR_MACUSER="ERROR_MACUSER";
    /**
     * ERROR_IMAGE
     * 请正确上传用户头像。
     */
    public static final String ERROR_IMAGE ="ERROR_IMAGE" ;
    /**
     * 文件上传地址
     */
    public static final String FILE_SERVICE ="FILE_SERVICE" ;
    /**
     * 用户名或密码为空
     */
    public static final String EMPTY_USERNAME_OR_PASSWORD ="EMPTY_USERNAME_OR_PASSWORD";
    /**
     * 密码的盐常量
     */
    public static final String SALT ="SALT";

    /**
     * 邮件上传时文件的扩展名
     */
    public static final String IMAGE_EXTENSION ="jpeg";
    /**
     * 系统错误msg
     */
    public static final String SYSTEM_ERR_MSG ="出现错误，请联系管理员。" ;

    public static final Integer OK = 1;
}
