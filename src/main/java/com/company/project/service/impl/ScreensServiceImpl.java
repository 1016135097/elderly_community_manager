package com.company.project.service.impl;

import com.company.project.dao.ScreensMapper;
import com.company.project.model.Screens;
import com.company.project.service.ScreensService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Mxy's CodeGenerator on 2017/12/29.
 */
@Service
@Transactional
public class ScreensServiceImpl extends AbstractService<Screens> implements ScreensService {
    @Resource
    private ScreensMapper screensMapper;

}
