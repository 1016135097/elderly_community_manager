package com.company.project.core.entity;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : WuWei
 * @Date : Created on 14:38 2018/3/6
 * @Description: 响应类
 * @Version : 1.0
 * @Modified By :
 **/
@Data
public class ResponseEntity implements Serializable {

	public ResponseEntity() {

	}

	public ResponseEntity(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public ResponseEntity(Integer code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	private Integer code = 1;

	private String msg;

	private Object data;

	private Date respTime;
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}
