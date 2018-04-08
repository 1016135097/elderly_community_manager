package com.stars.project.core.entity;

import com.stars.project.core.enumeration.HttpCode;

/**
 * @Author : mxy
 * @Date : Created on 14:38 2018/3/6
 * @Description: 返回错误实体
 * @Version : 1.0
 * @Modified By :
 **/
public class ErrorResponseEntity extends ResponseEntity {
	public ErrorResponseEntity(){
		super(HttpCode.ERROR);
	}
	public ErrorResponseEntity(String msg){
		super(HttpCode.ERROR, msg);
	}
	public ErrorResponseEntity(Object data){
		super(HttpCode.ERROR, HttpCode.ERROR.getMessage());
	}
	public ErrorResponseEntity(Integer code, String msg){
		super(HttpCode.ERROR, msg);
	}
	public ErrorResponseEntity(Integer code, String msg,Object data){
		super(HttpCode.ERROR, msg,data);
	}

}
