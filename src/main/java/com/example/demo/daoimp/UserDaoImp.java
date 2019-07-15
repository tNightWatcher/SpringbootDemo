package com.example.demo.daoimp;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class UserDaoImp implements UserDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveUser(User user) {
        mongoTemplate.save(user);
    }

    @Override
    public void removeUser(Long id) {
        //查找其id字段的值与传入参数id相等的数据
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,User.class);
    }

    @Override
    public User findUserByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        User user = mongoTemplate.findOne(query,User.class);
        return user;
    }

    @Override
    public int updateUser(User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update().set("name",user.getUserName()).set("password",user.getPassword());
        //更新查询返回的结果集的第一条数据
        UpdateResult result = mongoTemplate.updateFirst(query,update,User.class);
        //更新查询到的所有结果集
        if(result!= null) {
            return (int) result.getModifiedCount();
        }
        else {
            return 0;
        }
    }

    @Override
    public List<User> getUserList(){
        return mongoTemplate.findAll(User.class);
    }


}
