package com.alex.model;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

    private Integer id;

    private String name;

    private Integer userId;

    private Date createTime;

    public Student() {
    }

    public Student(String name, Integer userId, Date createTime) {
        this.name = name;
        this.userId = userId;
        this.createTime = createTime;
    }

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
