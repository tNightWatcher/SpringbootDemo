package com.example.demo.controller;

import com.example.demo.dao.TaskDao;
import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    @Autowired
    TaskService taskService;

    @RequestMapping(value="/TaskController/insertTask",method = RequestMethod.POST)
    @ResponseBody
    public String insertTaskInfo(@RequestBody(required=false) Task task){
        taskService.saveTask(task);
        return "index";
    }

    @RequestMapping(value="/taskController/getTaskList",method = RequestMethod.POST)
    @ResponseBody
    public List<Task> getTaskList(){
        List<Task> list = taskService.getTaskList();
        return list;
    }
}
