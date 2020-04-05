package com.example.bagevent_test.dao;

import com.example.bagevent_test.entity.UserLoginLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLoginLogDao {
    void isnertOneUserLog(@Param("loguser") UserLoginLog loguser);

    List<UserLoginLog> selectOneUserLoginLog();
}
