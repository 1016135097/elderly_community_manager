package com.company.project.service.impl;

import com.company.project.dao.CommentsMapper;
import com.company.project.model.Comments;
import com.company.project.service.CommentsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Mxy's CodeGenerator on 2017/12/29.
 */
@Service
@Transactional
public class CommentsServiceImpl extends AbstractService<Comments> implements CommentsService {
    @Resource
    private CommentsMapper commentsMapper;

}
