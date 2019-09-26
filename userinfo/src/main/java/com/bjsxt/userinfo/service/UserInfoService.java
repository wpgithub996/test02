package com.bjsxt.userinfo.service;

import com.bjsxt.userinfo.pojo.User;

public interface UserInfoService {
    //添加新用户
    void insertUser(User user);
    //查找用户(用户登录验证)
    User selectUser(User user);

    int updataUser(User user);
}
