package com.example.bagevent_test.service.impl;

import com.example.bagevent_test.dao.UserLoginLogDao;
import com.example.bagevent_test.entity.UserLoginLog;
import com.example.bagevent_test.service.UserLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLoginLogServiceImpl implements UserLoginLogService {
    @Autowired
    private UserLoginLogDao userLogDao;

    @Override
    public void isnertOneUserLog(UserLoginLog loguser) {
        userLogDao.isnertOneUserLog(loguser);
    }

    @Override
    public List<UserLoginLog> selectOneUserLoginLog() {
        return userLogDao.selectOneUserLoginLog();
    }
}
