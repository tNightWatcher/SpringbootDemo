package com.example.demo.dao;

import com.example.demo.entity.Task;

import java.util.List;

/**
 * @author HP
 */
public interface TaskDao {
        public void saveTask(Task task);
        public void removeTask(Long id);
        public Task findTaskByName(String name);
        //public int updateTask(Task task);
        public List<Task> getTaskList();
}
