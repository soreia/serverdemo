package com.example.demo.server;

import com.example.demo.model.User;

public interface UserService {
    User getUser(int id);
    void deleteUser(int id);

}
