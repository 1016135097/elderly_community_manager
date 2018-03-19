package com.company.project.service.impl;

import com.company.project.dao.CouponsMapper;
import com.company.project.model.Coupons;
import com.company.project.service.CouponsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Mxy's CodeGenerator on 2017/12/29.
 */
@Service
@Transactional
public class CouponsServiceImpl extends AbstractService<Coupons> implements CouponsService {
    @Resource
    private CouponsMapper couponsMapper;

}
