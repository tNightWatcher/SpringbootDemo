package com.example.demo.serviceImp;

import com.example.demo.dao.TaskDao;
import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description:
 *
 * @package:com.example.demo.serviceImp
 * @author:HP
 * @date:2019/7/25
 * @time:14:10
 */
@Service
public class TaskServiceImp implements TaskService {

    @Autowired
    TaskDao taskDao;

    @Override
    public String saveTask(Task task) {
        taskDao.saveTask(task);

        return "index";
    }

    @Override
    public List<Task> getTaskList() {

        List<Task> list = taskDao.getTaskList();

        return list;
    }
}
