package com.company.project.model;

import javax.persistence.*;

public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;

    private String password;

    @Column(name = "payPassword")
    private String paypassword;

    private String nickname;

    private Float money;

    private String description;

    private String avatar;

    @Column(name = "isAdmin")
    private Boolean isadmin;

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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return payPassword
     */
    public String getPaypassword() {
        return paypassword;
    }

    /**
     * @param paypassword
     */
    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return money
     */
    public Float getMoney() {
        return money;
    }

    /**
     * @param money
     */
    public void setMoney(Float money) {
        this.money = money;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return isAdmin
     */
    public Boolean getIsadmin() {
        return isadmin;
    }

    /**
     * @param isadmin
     */
    public void setIsadmin(Boolean isadmin) {
        this.isadmin = isadmin;
    }
}