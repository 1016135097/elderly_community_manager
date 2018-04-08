package com.stars.project.core.entity;

import com.alibaba.fastjson.JSON;
import com.stars.project.core.enumeration.HttpCode;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : mxy
 * @Date : Created on 14:38 2018/3/6
 * @Description: 响应类
 * @Version : 1.0
 * @Modified By :
 **/
@Data
public class ResponseEntity implements Serializable {

	public ResponseEntity() {

	}

	public ResponseEntity(HttpCode code) {
		this.code = code.value();
		this.msg = code.getMessage();
	}

	public ResponseEntity(HttpCode code,String msg) {
		this.code = code.value();
		this.msg = msg;
	}

	public ResponseEntity(HttpCode code, String msg, Object data) {
		this.code = code.value();
		this.msg = msg;
		this.data = data;
	}

	/**
	 * 返回代码
	 */
	private Integer code;
	/**
	 * 返回消息
	 */
	private String msg;
	/**
	 * 返回数据
	 */
	private Object data;
	/**
	 * 响应时间
	 */
	private Date respTime;
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}
