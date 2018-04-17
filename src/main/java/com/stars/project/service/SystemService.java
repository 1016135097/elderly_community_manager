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

/**
 * @Author : WuWei
 * @Date : Created on 22:48 2018/4/14
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
@Service(value="systemService")
public class SystemService {
    @Autowired(required = false)
    public SystemUserDao systemUserDao;

    public ResponseEntity checkUser(SystemUserEntity user) {
        try {
            String name = user.getName();
            SystemUserEntity userInfo = systemUserDao.findByname(name);
            if (userInfo == null) {
                return new FailureResponseEntity(SystemConst.MSG_LOGIN_USERNAME_ERR);
            } else if (!userInfo.getPassword().equals(user.getPassword())) {
                return new FailureResponseEntity(SystemConst.MSG_LOGIN_ERROR);
            } else {
                return new SuccessResponseEntity(SystemConst.MSG_LOGIN_SUCESS, userInfo);
            }
        } catch (Exception e) {
            return new ErrorResponseEntity(e.getMessage());
        }
    }
}
