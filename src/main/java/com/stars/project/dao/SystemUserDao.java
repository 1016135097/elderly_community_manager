package com.stars.project.dao;

import com.stars.project.model.entity.SystemUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @Author : WuWei
 * @Date : Created on 22:22 2018/4/14
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
public interface SystemUserDao extends JpaRepository<SystemUserEntity,Long> {
    /**
     * 根据名称查找用户
     * @param name
     * @return
     */
    SystemUserEntity findByName(String name);

    /**
     * 根据名称与身份证号找用户
     * @param name
     * @param idNumber
     * @return
     */
    SystemUserEntity findByNameAndIdNumber(String name,String idNumber);

    /**
     * 修改用户密码
     * @param password
     * @param id
     * @return
     */
    @Modifying
    @Query("update SystemUserEntity u set u.password = ?1 where u.id = ?2")
    int updatePassword(String password , long id);
}
