package com.company.project.core.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : WuWei
 * @Date : Created on 14:38 2018/3/6
 * @Description: 实体类基类
 * @Version : 1.0
 * @Modified By :
 **/
@SuppressWarnings("serial")
public class BaseEntity implements Serializable {
	
	
	/*
	 * 创建时间
	 */
	private Date createTime;
	/*
	 * 创建人
	 */
	private String creator;
	
	private Long creatorId;
	
	private Date updateTime;
	
	private String updator;
	
	private Long updatorId;

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	public String getUpdator() {
		return updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator;
	}


	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	public Long getUpdatorId() {
		return updatorId;
	}

	public void setUpdatorId(Long updatorId) {
		this.updatorId = updatorId;
	}

	@JSONField(format = "yyyy-MM-dd")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@JSONField(format = "yyyy-MM-dd")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
