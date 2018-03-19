package com.company.project.core.entity;


import com.company.project.core.constant.SystemConst;

/**
 * @Author : WuWei
 * @Date : Created on 14:38 2018/3/6
 * @Description: 返回错误实体
 * @Version : 1.0
 * @Modified By :
 **/
public class ErrorResponseEntity extends ResponseEntity {
	
	public ErrorResponseEntity(){
		super(0, SystemConst.SYSTEM_ERR_MSG);
	}
	public ErrorResponseEntity(String msg){
		super(0, msg);
	}
	public ErrorResponseEntity(Integer code, String msg){
		super(code, msg);
	}

}
