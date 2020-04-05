package com.example.bagevent_test.service;

import com.example.bagevent_test.entity.UserLoginLog;

import java.util.List;

public interface UserLoginLogService {
    void isnertOneUserLog(UserLoginLog loguser);
    List<UserLoginLog> selectOneUserLoginLog();
}
