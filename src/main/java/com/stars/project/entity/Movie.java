package com.stars.project.entity;

import lombok.Data;

import java.util.Date;
/**
 * @Author : Mxy
 * @Date : Created on 16:51 2018/3/20
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
@Data
public class Movie {
    private Long id;

    private String name;

    private String code;

    private Integer type;

    private Date year;

    private Date startTime;

    private Date endTime;

    private String area;

    private Integer grade;

    private Integer duration;

    private Integer discounts;

}