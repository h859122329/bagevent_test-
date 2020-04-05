package com.example.bagevent_test.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bagevent_test.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao extends BaseMapper<User> {

    void insert(@Param("number") String emailOrPhone, @Param("pwd")String pwd);

    /**
     *
     * @param emailOrPhone
     * @param pwd
     * @return
     */
    User checkUser(@Param("number") String emailOrPhone, @Param("pwd")String pwd);


}
