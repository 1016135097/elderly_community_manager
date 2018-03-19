package com.company.project.core.entity;

/**
 * @author yangzhi
 * @time 2016年1月19日下午12:25:17
 * @email zhi19861117@126.com
 * @version 1.0
 * @类介绍 返回成功的实体
 */
public class SuccessResponseEntity extends ResponseEntity {

	public SuccessResponseEntity(String msg) {
		super(1, msg);
	}

	public SuccessResponseEntity(Object data) {
		super(1, "正确的操作", data);
	}

	public SuccessResponseEntity() {
		super(1, "正确的操作");
	}

	public SuccessResponseEntity(String msg,Object data) {
		super(1,msg,data);
	}
}
