package com.stars.project.core.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : mxy
 * @Date : Created on 14:38 2018/3/6
 * @Description: 实体类基类
 * @Version : 1.0
 * @Modified By :
 **/
@SuppressWarnings("serial")
@Data
public class BaseEntity implements Serializable {
	
	private Date createTime;

	private Long creatorId;
	
	private Date updateTime;

	private Long updatorId;
}
