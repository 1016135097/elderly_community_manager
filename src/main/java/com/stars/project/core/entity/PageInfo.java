package com.stars.project.core.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : mxy
 * @Date : Created on 10:53 2018/3/7
 * @Description: 分页类
 * @Version : 1.0
 * @Modified By :
 **/
@SuppressWarnings("serial")
@Data
public class PageInfo<E> implements Serializable{

    /**
     * 返回数据
     */
    private List<E> rows;
    /**
     * 数据总条数
     */
	private long total;
    /**
     * 单页数据量
     */
	private Integer pageSize=10;
    /**
     * 起始页号
     */
	private Integer pageNumber=1;
	
	/**
	 * 排序：字段（自己根据前台定义，后台对应数据库字段
	 */
	private String sortColum;
	
	/**
	 * 排序：顺序（1升序，2降序）
	 */
	private Integer sortMethod = 1;

    /**
     * 获取数据起始下标
     * @return
     */
	public int getStart() {
		return (this.pageNumber - 1) * this.pageSize;
	}
}
