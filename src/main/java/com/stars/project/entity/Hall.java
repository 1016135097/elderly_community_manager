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
public class Hall {
    private Long id;

    private String name;

    private String code;

    private Integer type;

    private Long cinemaId;
}