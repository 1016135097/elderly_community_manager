package com.stars.project.service;

import com.stars.project.core.constant.SystemConst;
import com.stars.project.core.entity.ErrorResponseEntity;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.core.entity.SuccessResponseEntity;
import com.stars.project.dao.IllnessDao;
import com.stars.project.model.entity.IllnessEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 退休情况
 */
@Transactional
@Service(value="illnessService")
public class IllnessService {
    @Autowired(required = false)
    public IllnessDao illnessDao;

    public ResponseEntity saveIllness(IllnessEntity illnessEntity){
        try {
            illnessDao.save(illnessEntity);
            return new SuccessResponseEntity(SystemConst.OPERATION_OK, illnessEntity);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
    public void deleteIllnessByUserId(long userId){
        illnessDao.deleteByUserId(userId);
    }
    public ResponseEntity selectIllnessByUserId(long userId){
        try{
            IllnessEntity illnessEntity = illnessDao.findByUserId(userId);
            if(illnessEntity == null){
                illnessEntity = new IllnessEntity();
                illnessEntity.setUserId(userId);
            }
            return new SuccessResponseEntity(SystemConst.OPERATION_OK, illnessEntity);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
}
