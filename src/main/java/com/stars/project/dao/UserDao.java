package com.stars.project.dao;

import com.stars.project.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author : WuWei
 * @Date : Created on 22:20 2018/4/14
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
public interface UserDao extends JpaRepository<UserEntity,Long> {
    List<UserEntity> findAllByType(long type);
}
