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
public class Screening {
    private Long id;

    private String code;

    private String name;

    private Date startTime;

    private Date endTime;

    private Integer scrState;

}