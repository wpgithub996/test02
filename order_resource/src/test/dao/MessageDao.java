package com.bjsxt.userinfo.dao;

import com.bjsxt.userinfo.pojo.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MessageDao extends JpaRepository<Message,Integer>,JpaSpecificationExecutor<Message> {
}
