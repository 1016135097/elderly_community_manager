package com.stars.project.mapper;

import com.stars.project.entity.Cinema;

public interface CinemaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Cinema record);

    int insertSelective(Cinema record);

    Cinema selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Cinema record);

    int updateByPrimaryKey(Cinema record);
}