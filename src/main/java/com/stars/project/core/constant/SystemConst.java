package com.stars.project.core.constant;

public class SystemConst {
    /**
     * 数据可以使用
     * 与数据库中state值对应。
     */
    public static final Integer STATE_OK = 1;
    /**
     * 数据不可以使用
     * 与数据库中state值对应。
     */
    public static final String STATE_FAIL = "0";

    /**
     * 加密算法
     * 可以用java MessageDigest支持的所有加密方法
     * <li>{@code MD5}</li>
     * <li>{@code SHA-1}</li>
     * <li>{@code SHA-256}</li>
     *
     */
    public static final String ALGORITHM = "ALGORITHM";
    /**
     * EXITS_LOGINNAME
     * 登录名已存在，请重新填写！
     */
    public static final String EXITS_LOGINNAME = "EXITS_LOGINNAME";
    /**
     * EXITS_USERCODE
     * 用户代码已存在，请重新填写！
     */
    public static final String EXITS_USERCODE = "EXITS_USERCODE";
    /**
     * 操作成功 OK
     */
    public static final String OPERATION_OK = "操作成功！";
    /**
     * 操作失败 FAIL
     */
    public static final String OPERATION_FAIL = "操作失败！";
    /**
     * 部分成功 PART_OK
     *
     */
    public static final String OPERATION_PART_OK = "部分操作失败，请重试！";
    /**
     * 出现错误 ERROR
     */
    public static final String OPERATION_ERROER = "出现错误，请联系管理员！";
    /**
     * ' , ' 分隔符
     */
    public static final String SPLIT_CHAR = ",";
    /**
     * 登录错误信息
     */
    public static final String MSG_LOGIN_ERROR = "请正确填写用户名密码！";
    /**
     * 登录成功
     */
    public static final String MSG_LOGIN_SUCESS = "登录成功！";
    /**
     * 登录用户
     */
    public static final String USER = "user";
    /**
     * 登录用户名
     */
    public static final String USERNAME = "username";
    /**
     * 登录错误次数
     */
    public static final String  LOGIN_ERROR_TIMES = "5";
    /**
     * 账号锁定
     */
    public static final String  MSG_LOGIN_LOCKED = "账号锁定！";
    /**
     * 用户名不能为空
     */
    public static final String  MSG_LOGIN_USERNAME="用户名不能为空！";
    /**
     * 输入的用户名不正确，请重新输入。
     */
    public static final String  MSG_LOGIN_USERNAME_ERR = "输入的用户名不正确，请重新输入。";
    /**
     * 用户名与身份证不匹配
     */
    public static final String  MSG_USERNAME_IDNUMBER_ERR = "用户名与身份证不匹配";
    /**
     * 普通用户不能以管理员身份登录
     */
    public static final String  MSG_TYPE_ERR = "普通用户不能以管理员身份登录";

    /**
     * 用户名已存在
     */
    public static final String  MSG_NAME_ERR = "用户名已存在";
    /**
     *
     */
    public static final String  CHANGE_SUCCESS = "修改成功";
    /**
     * 用户默认密码
     */
    public static final String PASSWORD_DEFAULT = "PASSWORD_DEFAULT";
    /**
     * 管理员字符串
     */
    public static final String STR_ADMIN = "STR_ADMIN";
    /**
     * 字符串为真
     * true
     */
    public static final String STR_TRUE = "true";
    /**
     * 用户名或密码为空
     */
    public static final String EMPTY_USERNAME_OR_PASSWORD = "EMPTY_USERNAME_OR_PASSWORD";
    /**
     * 密码的盐常量
     */
    public static final String SALT = "SALT";
}
