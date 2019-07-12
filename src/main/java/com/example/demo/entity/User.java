package com.example.demo.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;


/**
 * description:用户实体类
 *
 * @package:com.example.demo.entity
 * @author:HP
 * @date:2019/7/8
 * @time:14:41
 */
@Document(collection = "user_info")
public class User {
    @Id
    private String id;
    @Field("account")
    private String account;
    @Field("password")
    private String password;
    @Field("name")
    private String userName;
    @Field("age")
    private Integer age;
    @Field("sex")
    private String sex;
    @Field("last_change_time")
    private Date lastChangeTime;
    @Field("create_time")
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getLastChangeTime() {
        return lastChangeTime;
    }

    public void setLastChangeTime(Date lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", lastChangeTime=" + lastChangeTime +
                ", createTime=" + createTime +
                '}';
    }
}
