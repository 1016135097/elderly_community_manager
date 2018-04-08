package com.stars.project.entity;

import lombok.Data;

/**
 * @Author : Mxy
 * @Date : Created on 16:51 2018/3/20
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
@Data
public class User {
    private Long id;

    private String loginName;

    private String userName;

    private Integer sex;

    private String mobile;

    private String email;

    private String password;

    private Integer type;
    
}