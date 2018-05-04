package com.stars.project.service;

import com.stars.project.core.constant.SystemConst;
import com.stars.project.core.entity.ErrorResponseEntity;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.core.entity.SuccessResponseEntity;
import com.stars.project.dao.ChildrenDao;
import com.stars.project.model.entity.ChildrenEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value="childrenService")
public class ChildrenService {
    @Autowired(required = false)
    public ChildrenDao childrenDao;

    /**
     * 保存子女信息
     * @param childrenEntity
     */
    public ResponseEntity saveChildren(ChildrenEntity childrenEntity){
        try {
            childrenDao.save(childrenEntity);;
            return new SuccessResponseEntity(SystemConst.OPERATION_OK, childrenEntity);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
    public ResponseEntity selectChildrenByUserId(long userId){
        try {
            ChildrenEntity childrenEntity = childrenDao.findByUserId(userId);
            if(childrenEntity == null){
                childrenEntity = new ChildrenEntity();
                childrenEntity.setUserId(userId);
            }
            return new SuccessResponseEntity(SystemConst.OPERATION_OK, childrenEntity);
        }catch (Exception e){
            return new ErrorResponseEntity(e.getMessage());
        }
    }
    public void deleteChildrenByUserId(long userId){ childrenDao.deleteByUserId(userId);}
}
