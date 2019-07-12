package com.example.demo;

import com.example.demo.daoimp.UserDaoImp;
import com.example.demo.entity.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired
    private UserDaoImp userDaoImp;

    @org.junit.Test
    public void saveUser() {
        User u = new User();
        //u.setId("5L");
        u.setAccount("xiaoming");
        u.setPassword("123456");
        u.setUserName("xiaoming");
        u.setAge(24);
        u.setSex("男");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        u.setLastChangeTime(new Date());
        u.setCreateTime(new Date());
        userDaoImp.saveUser(u);
    }

    @org.junit.Test
    public void removeUser() {
        userDaoImp.removeUser(1L);
    }

    @org.junit.Test
    public void findUserByName() {
        User u = userDaoImp.findUserByName("xiaoming");
        System.out.println(u);
    }

    @org.junit.Test
    public void updateUser() {
        User u = new User();
        u.setId("1L");
        u.setUserName("abcedf");
        u.setPassword("qwerttyui");
        int update_num = userDaoImp.updateUser(u);
        System.out.println("update num:" + update_num);
    }

}