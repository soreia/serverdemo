package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.TUser;
import com.example.demo.model.User;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<TUser>{

    // Update an existing user
    public void updateUser(User user);  

    // Delete a user by ID
    public void deleteUser(int id);

    // Insert a new user
    public void insertUser(User user);

    // Get a user by ID
    public User getUser(int id);
    
}
