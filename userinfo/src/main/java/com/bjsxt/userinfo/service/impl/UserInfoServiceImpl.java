package com.bjsxt.userinfo.service.impl;

import com.bjsxt.userinfo.pojo.User;
import com.bjsxt.userinfo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private EntityManager entityManager;
    ///添加新用户
    @Transactional
    @Override
    public void insertUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User selectUser(User user) {
        Query query = entityManager.createNativeQuery("SELECT * from t_user where uname=" + user.getUname() + "and password=" + user.getPassword());
        User u = (User) query.getResultList().get(0);
        return u;
    }

    @Transactional
    @Override
    public int updataUser(User user){
//        Query query = entityManager.createNativeQuery("UPDATE t_user set uname=\"" + user.getUname() + "\" where uid=" + user.getUid());
        Query query = entityManager.createNativeQuery("UPDATE t_user set uname=\"" + user.getUname() + "\" where uid=" + user.getUid());
        return query.executeUpdate();
    };
}
