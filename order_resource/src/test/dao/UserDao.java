package com.bjsxt.userinfo.dao;

import com.bjsxt.userinfo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User> {
}
