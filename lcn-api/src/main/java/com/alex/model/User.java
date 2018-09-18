package com.alex.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author aixuexi
 */
public class User implements Serializable {

    private Integer id;

    private String name;

    private Integer sex;

    private String telephone;

    private String email;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User() {
    }

    public User(String name, Integer sex, String telephone, String email, Date createTime) {
        this.name = name;
        this.sex = sex;
        this.telephone = telephone;
        this.email = email;
        this.createTime = createTime;
    }
}
