package com.company.project.service.impl;

import com.company.project.dao.RecommendsMapper;
import com.company.project.model.Recommends;
import com.company.project.service.RecommendsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Mxy's CodeGenerator on 2017/12/29.
 */
@Service
@Transactional
public class RecommendsServiceImpl extends AbstractService<Recommends> implements RecommendsService {
    @Resource
    private RecommendsMapper recommendsMapper;

}
