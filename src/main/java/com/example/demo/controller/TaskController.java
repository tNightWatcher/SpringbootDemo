package com.example.demo.controller;

import com.example.demo.dao.TaskDao;
import com.example.demo.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description:
 *
 * @package:com.example.demo.controller
 * @author:HP
 * @date:2019/7/15
 * @time:15:14
 */
@Controller
public class TaskController {
    @Autowired
    TaskDao taskDao;

    @RequestMapping(value="/TaskController/insertTask",method = RequestMethod.POST)
    @ResponseBody
    public String insertUserInfo(@RequestBody(required=false) Task task){
        taskDao.saveTask(task);

        System.out.println(task.toString());

        return "index";
    }
}
