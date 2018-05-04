package com.stars.project.service;

import com.stars.project.core.constant.SystemConst;
import com.stars.project.core.entity.ErrorResponseEntity;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.core.entity.SuccessResponseEntity;
import com.stars.project.dao.UserDao;
import com.stars.project.dao.WorkFlowDao;
import com.stars.project.model.entity.UserEntity;
import com.stars.project.model.entity.WorkFlowEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Author : WuWei
 * @Date : Created on 22:34 2018/4/14
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
@Transactional
@Service(value="userService")
public class UserService {
    @Autowired(required = false)
    public UserDao userDao;
    @Autowired(required = false)
    public ChildrenService childrenService;
    @Autowired(required = false)
    public RetireService retireService;
    @Autowired(required = false)
    public IllnessService illnessService;
    @Autowired(required = false)
    public WorkFlowDao workFlowDao;
    public ResponseEntity addOldUser(UserEntity user){
        try {
            if(user.getCreateTime() == null){
                user.setCreateTime(new Timestamp(System.currentTimeMillis()));
            }
            userDao.save(user);
            return new SuccessResponseEntity(SystemConst.CHANGE_SUCCESS, user);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
    public ResponseEntity selectAllOldUser(){
        try {
            List<UserEntity> oldUsers =userDao.findAll();
            return new SuccessResponseEntity(SystemConst.OPERATION_OK, oldUsers);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }

    public ResponseEntity deleteOldUser(long id){
        try {
            childrenService.deleteChildrenByUserId(id);
            retireService.deleteRetireByUserId(id);
            illnessService.deleteIllnessByUserId(id);
            userDao.delete(id);
            return new SuccessResponseEntity(SystemConst.OPERATION_OK, id);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
    public ResponseEntity selectOldUseById(long id){
        try {
            UserEntity userInfo =userDao.findOne(id);
            return new SuccessResponseEntity(SystemConst.OPERATION_OK, userInfo);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
    public ResponseEntity selectNeedHelpOldUser(long type){
        try {
            List<UserEntity> userInfos =userDao.findAllByType(type);
            return new SuccessResponseEntity(SystemConst.OPERATION_OK, userInfos);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
    public ResponseEntity recieveTask(long id,long userId){
        try {
            UserEntity oldUser =userDao.findOne(id);
            oldUser.setType(2);
            userDao.save(oldUser);
            WorkFlowEntity workFlowEntity =new WorkFlowEntity();
            workFlowEntity.setName(oldUser.getName());
            workFlowEntity.setUserId(userId);
            workFlowDao.save(workFlowEntity);
            return new SuccessResponseEntity(SystemConst.OPERATION_OK, oldUser);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
    public ResponseEntity selectreceivedTask(long userId) {
        try {
               return null;
         } catch (Exception e) {
            return new ErrorResponseEntity(e.getMessage());
        }
    }
}
