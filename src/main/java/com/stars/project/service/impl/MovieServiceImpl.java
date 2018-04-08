package com.stars.project.service.impl;

import com.stars.project.core.entity.PageInfo;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.entity.Movie;
import com.stars.project.mapper.MovieMapper;
import com.stars.project.service.MovieService;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * Created by Mxy's CodeGenerator on 2017/12/29.
 */
@Service("movieService")
@Transactional(rollbackFor = Exception.class)
public class MovieServiceImpl implements MovieService {

    @Override
    public ResponseEntity insert(Movie model) {
        return null;
    }

    @Override
    public ResponseEntity insertList(List<Movie> models) {
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
    public ResponseEntity update(Movie model) {
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
