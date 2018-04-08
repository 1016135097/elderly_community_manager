package com.stars.project.core.entity;

import com.stars.project.core.enumeration.HttpCode;

/**
 * @author yangzhi
 * @time 2016年1月19日下午12:25:17
 * @email zhi19861117@126.com
 * @version 1.0
 * @类介绍 返回成功的实体
 */
public class SuccessResponseEntity extends ResponseEntity {

	public SuccessResponseEntity() {
		super(HttpCode.SUCCESS);
	}

	public SuccessResponseEntity(String msg) {
		super(HttpCode.SUCCESS, msg);
	}

	public SuccessResponseEntity(Object data) {
		super(HttpCode.SUCCESS,HttpCode.SUCCESS.getMessage(), data);
	}

	public SuccessResponseEntity(String msg,Object data) {
		super(HttpCode.SUCCESS,msg,data);
	}
}
