package com.company.project.service.impl;

import com.company.project.dao.FavoritesMapper;
import com.company.project.model.Favorites;
import com.company.project.service.FavoritesService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Mxy's CodeGenerator on 2017/12/29.
 */
@Service
@Transactional
public class FavoritesServiceImpl extends AbstractService<Favorites> implements FavoritesService {
    @Resource
    private FavoritesMapper favoritesMapper;

}
