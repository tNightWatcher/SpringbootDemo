package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping(value = "/insertUserInfo", method = RequestMethod.GET)
    public String insertUserInfo(){
        return "/user/insertUserInfo";
    }
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public String getUserList(){
        return "/user/userList";
    }
    @RequestMapping(value = "/insertTask", method = RequestMethod.GET)
    public String insertTask(){
        return "/task/insertTask";
    }
    @RequestMapping(value = "/taskList", method = RequestMethod.GET)
    public String getTaskList(){
        return "/task/taskList";
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}
