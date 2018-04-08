package com.stars.project.mapper;

import com.stars.project.entity.Seat;

public interface SeatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Seat record);

    int insertSelective(Seat record);

    Seat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Seat record);

    int updateByPrimaryKey(Seat record);
}