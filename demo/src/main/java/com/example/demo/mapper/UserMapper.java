package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Mapper
@Repository
public interface UserMapper {

    public void updateUser(User user);

    public void deleteUser(int id);

    public void insertUser(User user);

    @Select("SELECT * FROM users WHERE id = #{id}")
    public User getUser(int id);
    
}
