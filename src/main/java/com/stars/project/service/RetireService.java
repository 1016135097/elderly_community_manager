package com.stars.project.service;

import com.stars.project.core.constant.SystemConst;
import com.stars.project.core.entity.ErrorResponseEntity;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.core.entity.SuccessResponseEntity;
import com.stars.project.dao.RetireDao;
import com.stars.project.model.entity.RetireEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 退休情况
 */
@Transactional
@Service(value="retireService")
public class RetireService {
    @Autowired(required = false)
    public RetireDao retireDao;

    /**
     * 保存退休信息
     * @param retireEntity
     */
    public ResponseEntity saveRetire(RetireEntity retireEntity){
        try {
            retireDao.save(retireEntity);;
            return new SuccessResponseEntity(SystemConst.OPERATION_OK, retireEntity);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
    public ResponseEntity selectRetireByUserId(long userId){
        try{
            RetireEntity retireEntity = retireDao.findByUserId(userId);
            if(retireEntity == null){
                retireEntity = new RetireEntity();
                retireEntity.setUserId(userId);
            }
            return new SuccessResponseEntity(SystemConst.OPERATION_OK, retireEntity);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
    public void deleteRetireByUserId(long userId){ retireDao.deleteByUserId(userId);}
}
