package com.example.demo.server;
import com.example.demo.model.User;
import com.example.demo.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(int id) {
        return userMapper.getUser(id);
    }

    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }
}