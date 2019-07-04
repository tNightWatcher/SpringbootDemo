package com.example.demo.controller;

import com.example.demo.Dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class UserController {
    @Autowired
    UserDao userDao;


    @RequestMapping(value="/UserController/insertUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public String insertUserInfo(@RequestBody(required=false) User user){
            user.setCreateTime(new Date());
            user.setLastChangeTime(new Date());
            userDao.saveUser(user);

            System.out.println(user.toString());

            return "index";
    }
}
