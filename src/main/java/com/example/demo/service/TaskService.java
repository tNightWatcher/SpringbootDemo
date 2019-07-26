package com.example.demo.service;

import com.example.demo.entity.Task;

import java.util.List;

/**
 * description:
 *
 * @package:com.example.demo.service
 * @author:HP
 * @date:2019/7/25
 * @time:14:09
 */

public interface TaskService {
    /**
     * 保存任务
     * @param task
     * @return
     */
    public String saveTask(Task task);

    /**
     * 获取任务列表
     * @return
     */
    public List<Task> getTaskList();

}
