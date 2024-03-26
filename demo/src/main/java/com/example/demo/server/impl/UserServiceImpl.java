package com.example.demo.server.impl;
import com.example.demo.model.User;
import com.example.demo.server.UserService;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    // @Autowired
    // private UserMapper userMapper;

    @Override
    public User getUser(int id) {
        User user = new User();
        user.setId('1');
        user.setName("test");
        
        return user;
    }
    @Override
    public void deleteUser(int id) {
        //userMapper.deleteUser(id);
    }
}