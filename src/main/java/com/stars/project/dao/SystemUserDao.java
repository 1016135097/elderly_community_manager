package com.stars.project.dao;

import com.stars.project.model.entity.SystemUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : WuWei
 * @Date : Created on 22:22 2018/4/14
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
public interface SystemUserDao extends JpaRepository<SystemUserEntity,Long> {
    public SystemUserEntity findByname(String name);
}
