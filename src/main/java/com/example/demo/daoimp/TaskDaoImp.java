package com.example.demo.daoimp;

import com.example.demo.dao.TaskDao;
import com.example.demo.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * description:任务实体类Dao层
 *
 * @package:com.example.demo.daoimp
 * @author:HP
 * @date:2019/7/15
 * @time:15:01
 */
@Component
public class TaskDaoImp implements TaskDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveTask(Task task) {
        mongoTemplate.save(task);
    }

    @Override
    public void removeTask(Long id) {
        //查找其id字段的值与传入参数id相等的数据
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,Task.class);
    }

    @Override
    public Task findTaskByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        Task task = mongoTemplate.findOne(query,Task.class);
        return task;
    }

//    @Override
//    public int updateTask(Task task) {
//        Query query = new Query(Criteria.where("id").is(task.getId()));
//        Update update = new Update().set("name",task.getTaskName()).set("password",task.getPassword());
//        //更新查询返回的结果集的第一条数据
//        UpdateResult result = mongoTemplate.updateFirst(query,update,Task.class);
//        //更新查询到的所有结果集
//        if(result!= null) {
//            return (int) result.getModifiedCount();
//        }
//        else {
//            return 0;
//        }
//    }

    @Override
    public List<Task> getTaskList(){
        return mongoTemplate.findAll(Task.class);
    }


}
