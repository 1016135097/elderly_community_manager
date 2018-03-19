package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Coupons {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;

    private Short discount;

    private Short condition;

    private String username;

    @Column(name = "expiredTime")
    private Date expiredtime;

    private Boolean status;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return discount
     */
    public Short getDiscount() {
        return discount;
    }

    /**
     * @param discount
     */
    public void setDiscount(Short discount) {
        this.discount = discount;
    }

    /**
     * @return condition
     */
    public Short getCondition() {
        return condition;
    }

    /**
     * @param condition
     */
    public void setCondition(Short condition) {
        this.condition = condition;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return expiredTime
     */
    public Date getExpiredtime() {
        return expiredtime;
    }

    /**
     * @param expiredtime
     */
    public void setExpiredtime(Date expiredtime) {
        this.expiredtime = expiredtime;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}