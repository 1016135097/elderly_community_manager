package com.stars.project.service;

import com.stars.project.core.constant.SystemConst;
import com.stars.project.core.entity.ErrorResponseEntity;
import com.stars.project.core.entity.FailureResponseEntity;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.core.entity.SuccessResponseEntity;
import com.stars.project.dao.SystemUserDao;
import com.stars.project.model.entity.SystemUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

/**
 * @Author : WuWei
 * @Date : Created on 22:48 2018/4/14
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
@Transactional
@Service(value="systemService")
public class SystemService {
    @Autowired(required = false)
    public SystemUserDao systemUserDao;

    public ResponseEntity checkUserByName(SystemUserEntity user) {
        try {
            String name = user.getName();
            SystemUserEntity userInfo = systemUserDao.findByName(name);
            if (userInfo == null) {
                return new FailureResponseEntity(SystemConst.MSG_LOGIN_USERNAME_ERR);
            } else if (!userInfo.getPassword().equals(user.getPassword())) {
                return new FailureResponseEntity(SystemConst.MSG_LOGIN_ERROR);
            } else if(user.getType()==1&&userInfo.getType()!=1){
                return new FailureResponseEntity(SystemConst.MSG_TYPE_ERR, userInfo);
            }else{
                return new SuccessResponseEntity(SystemConst.MSG_LOGIN_SUCESS, userInfo);
            }
        } catch (Exception e) {
            return new ErrorResponseEntity(e.getMessage());
        }
    }
    public ResponseEntity checkUserByNameAndIdNumber(SystemUserEntity user) {
        try {
            String name = user.getName();
            String idNumber = user.getIdNumber();
            SystemUserEntity userInfo = systemUserDao.findByNameAndIdNumber(name,idNumber);
            if (userInfo == null) {
                return new FailureResponseEntity(SystemConst.MSG_USERNAME_IDNUMBER_ERR);
            } else {
                return new SuccessResponseEntity(SystemConst.MSG_LOGIN_SUCESS, userInfo);
            }
        } catch (Exception e) {
            return new ErrorResponseEntity(e.getMessage());
        }
    }
    public ResponseEntity updatePassword(SystemUserEntity user){
        try {
            systemUserDao.updatePassword(user.getPassword(),user.getId());
            return new SuccessResponseEntity(SystemConst.CHANGE_SUCCESS, user);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
    public ResponseEntity saveUser(SystemUserEntity user){
        try {
            String name = user.getName();
            SystemUserEntity userInfo = systemUserDao.findByName(name);
            if(userInfo!=null){
                return new FailureResponseEntity(SystemConst.MSG_NAME_ERR);
            }
            user.setCreateTime(new Timestamp(System.currentTimeMillis()));
            systemUserDao.save(user);
            return new SuccessResponseEntity(SystemConst.OPERATION_OK, user);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
}
