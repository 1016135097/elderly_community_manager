package com.stars.project.dao;

import com.stars.project.model.entity.MedicalAndLifeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : WuWei
 * @Date : Created on 22:26 2018/4/14
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
public interface MedicalAndLifeDao extends JpaRepository<MedicalAndLifeEntity,Long> {
}
