package com.example.demo.dao;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @author HP
 */
public interface UserDao {
        public void saveUser(User user);
        public void removeUser(Long id);
        public User findUserByName(String name);
        public int updateUser(User user);
        public List<User> getUserList();
}
