package com.stars.project.core.intf;

import com.stars.project.core.entity.PageInfo;
import org.apache.ibatis.exceptions.TooManyResultsException;

import java.util.List;
import java.util.Map;

/**
 * Service 层 基础接口，其他Service 接口 请继承该接口
 */
public interface Service<V,T> {
    V insert(T model);//持久化
    V insertList(List<T> models);//批量持久化
    V deleteById(Long id);//通过主鍵刪除
    V deleteByIds(String ids);//批量刪除 eg：ids -> “1,2,3,4”
    V update(T model);//更新
    V selectOneById(Long id);//通过ID查找
    V selectListByMap(Map map, PageInfo pageInfo) throws TooManyResultsException; //通过Model中某个成员变量名称（非数据表中column的名称）查找,value需符合unique约束
    V selectByIds(String ids);//通过多个ID查找//eg：ids -> “1,2,3,4”
    V selectAll();//获取所有
}
