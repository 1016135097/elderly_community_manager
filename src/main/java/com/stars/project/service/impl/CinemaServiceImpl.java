package com.stars.project.service.impl;

import com.stars.project.core.entity.PageInfo;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.entity.Cinema;
import com.stars.project.service.CinemaService;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author : mxy
 * @Date : Created on 16:53 2018/3/20
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
@Service("cinemaService")
public class CinemaServiceImpl implements CinemaService{
    @Override
    public ResponseEntity insert(Cinema model) {
        return null;
    }

    @Override
    public ResponseEntity insertList(List<Cinema> models) {
        return null;
    }

    @Override
    public ResponseEntity deleteById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity deleteByIds(String ids) {
        return null;
    }

    @Override
    public ResponseEntity update(Cinema model) {
        return null;
    }

    @Override
    public ResponseEntity selectOneById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity selectListByMap(Map map, PageInfo pageInfo) throws TooManyResultsException {
        return null;
    }

    @Override
    public ResponseEntity selectByIds(String ids) {
        return null;
    }

    @Override
    public ResponseEntity selectAll() {
        return null;
    }
}
