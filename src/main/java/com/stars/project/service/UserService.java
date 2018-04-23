package com.stars.project.service;

import com.stars.project.core.constant.SystemConst;
import com.stars.project.core.entity.ErrorResponseEntity;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.core.entity.SuccessResponseEntity;
import com.stars.project.dao.UserDao;
import com.stars.project.model.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public ResponseEntity addOldUser(UserEntity user){
        try {
            userDao.save(user);
            return new SuccessResponseEntity(SystemConst.CHANGE_SUCCESS, user);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
}
