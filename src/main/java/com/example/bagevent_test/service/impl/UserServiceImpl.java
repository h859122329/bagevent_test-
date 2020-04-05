package com.example.bagevent_test.service.impl;

import com.example.bagevent_test.dao.UserDao;
import com.example.bagevent_test.entity.User;
import com.example.bagevent_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addOneUser(String number,String pwd) {
        userDao.insert(number,pwd);
    }

    @Override
    public User checkUser(String emailOrPhone, String pwd) {
        return userDao.checkUser(emailOrPhone,pwd);
    }
}
