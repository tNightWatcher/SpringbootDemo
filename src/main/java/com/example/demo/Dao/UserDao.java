package com.example.demo.Dao;

import com.example.demo.entity.User;

public interface UserDao {
        public void saveUser(User user);
        public void removeUser(Long id);
        public User findUserByName(String name);
        public int updateUser(User user);
}
