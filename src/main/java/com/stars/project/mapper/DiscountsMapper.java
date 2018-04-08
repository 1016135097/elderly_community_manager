package com.stars.project.mapper;

import com.stars.project.entity.Discount;

public interface DiscountsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Discount record);

    int insertSelective(Discount record);

    Discount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Discount record);

    int updateByPrimaryKey(Discount record);
}