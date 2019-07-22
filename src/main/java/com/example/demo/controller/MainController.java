package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){

        return "testHello";
    }
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2(){

        return "/jsp/testHello";
    }

    @RequestMapping(value = "/insertUserInfo", method = RequestMethod.GET)
    public String test3(){

        return "/user/insertUserInfo";
    }
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public String test4(){

        return "/user/userList";
    }
    @RequestMapping(value = "/insertTask", method = RequestMethod.GET)
    public String test5(){

        return "/task/insertTask";
    }
    @RequestMapping(value = "/taskList", method = RequestMethod.GET)
    public String test6(){

        return "/task/taskList";
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String test7(){

        return "index";
    }
    @RequestMapping(value = "/2", method = RequestMethod.GET)
    public String test8(){

        return "2";
    }
    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public String test9(){

        return "1";
    }
}
