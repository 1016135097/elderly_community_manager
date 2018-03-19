package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Orders {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;

    @Column(name = "screenId")
    private String screenid;

    private String username;

    @Column(name = "createTime")
    private Date createtime;

    private Boolean status;

    @Column(name = "couponId")
    private String couponid;

    @Column(name = "totalPrice")
    private Float totalprice;

    @Column(name = "payPrice")
    private Float payprice;

    private byte[] seat;

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
     * @return screenId
     */
    public String getScreenid() {
        return screenid;
    }

    /**
     * @param screenid
     */
    public void setScreenid(String screenid) {
        this.screenid = screenid;
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
     * @return createTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    /**
     * @return couponId
     */
    public String getCouponid() {
        return couponid;
    }

    /**
     * @param couponid
     */
    public void setCouponid(String couponid) {
        this.couponid = couponid;
    }

    /**
     * @return totalPrice
     */
    public Float getTotalprice() {
        return totalprice;
    }

    /**
     * @param totalprice
     */
    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * @return payPrice
     */
    public Float getPayprice() {
        return payprice;
    }

    /**
     * @param payprice
     */
    public void setPayprice(Float payprice) {
        this.payprice = payprice;
    }

    /**
     * @return seat
     */
    public byte[] getSeat() {
        return seat;
    }

    /**
     * @param seat
     */
    public void setSeat(byte[] seat) {
        this.seat = seat;
    }
}