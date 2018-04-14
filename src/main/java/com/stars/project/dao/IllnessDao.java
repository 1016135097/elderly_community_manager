package com.stars.project.dao;

import com.stars.project.model.entity.IllnessEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : WuWei
 * @Date : Created on 22:25 2018/4/14
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
public interface IllnessDao extends JpaRepository<IllnessEntity,Long> {
}
