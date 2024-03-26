package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("users")
public class TUser {
    private Long id;
    private String name;
    private Integer age;


}
