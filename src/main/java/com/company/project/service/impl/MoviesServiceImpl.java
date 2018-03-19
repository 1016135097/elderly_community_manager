package com.company.project.service.impl;

import com.company.project.dao.MoviesMapper;
import com.company.project.model.Movies;
import com.company.project.service.MoviesService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Mxy's CodeGenerator on 2017/12/29.
 */
@Service
@Transactional
public class MoviesServiceImpl extends AbstractService<Movies> implements MoviesService {
    @Resource
    private MoviesMapper moviesMapper;

}
