package com.stars.project.core.entity;

import com.stars.project.core.enumeration.HttpCode;

/**
 * @author mxy
 * @time Fri, 25 Aug 2017 10:37:29 GMT
 * @version 1.0
 * @类介绍 返回失败实体类
 */
public class FailureResponseEntity extends ResponseEntity {
    public FailureResponseEntity() {
        super(HttpCode.FAIL);
    }
    public FailureResponseEntity(String msg) {
        super(HttpCode.FAIL, msg);
    }
    public FailureResponseEntity(Object data) {
        super(HttpCode.FAIL, HttpCode.FAIL.getMessage(), data);
    }
    public FailureResponseEntity(String msg,Object data) {
        super(HttpCode.FAIL, msg, data);
    }
}
