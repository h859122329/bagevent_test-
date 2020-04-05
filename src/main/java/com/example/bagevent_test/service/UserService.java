package com.example.bagevent_test.service;


import com.example.bagevent_test.entity.User;

public interface UserService {
    void addOneUser(String number,String pwd);
    User checkUser(String emailOrPhone,String pwd);
}
