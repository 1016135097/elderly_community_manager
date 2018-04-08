package com.stars.project.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author : Mxy
 * @Date : Created on 16:51 2018/3/20
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
@Data
public class Order {
    private Long id;

    private String code;

    private BigDecimal price;

    private Long moveId;

    private Date createTime;

    private Integer orderState;

    private Integer payState;

    private Long discoId;

}