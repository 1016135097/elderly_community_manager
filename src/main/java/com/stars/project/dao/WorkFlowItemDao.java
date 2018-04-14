package com.stars.project.dao;

import com.stars.project.model.entity.WorkFlowItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : WuWei
 * @Date : Created on 22:28 2018/4/14
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
public interface WorkFlowItemDao extends JpaRepository<WorkFlowItemEntity,Long> {
}
