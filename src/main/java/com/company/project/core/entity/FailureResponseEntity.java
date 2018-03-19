package com.company.project.core.entity;

/**
 * @author wuwei
 * @time Fri, 25 Aug 2017 10:37:29 GMT
 * @version 1.0
 * @类介绍 返回失败实体类
 */
public class FailureResponseEntity extends ResponseEntity {
    public FailureResponseEntity(String msg) {
        super(-1, msg);
    }

    public FailureResponseEntity(Object data) {
        super(-1, "操作失败", data);
    }

    public FailureResponseEntity() {
        super(-1, "操作失败");
    }
    public FailureResponseEntity(String msg,Object data) {
        super(-1, msg, data);
    }
}
