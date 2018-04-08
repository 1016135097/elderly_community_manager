package com.stars.project.mapper;

import com.stars.project.entity.Hall;

public interface HallMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Hall record);

    int insertSelective(Hall record);

    Hall selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Hall record);

    int updateByPrimaryKey(Hall record);
}