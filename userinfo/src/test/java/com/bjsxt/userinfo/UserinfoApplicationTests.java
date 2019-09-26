package com.bjsxt.userinfo;

import com.bjsxt.userinfo.pojo.User;
import com.bjsxt.userinfo.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserinfoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void initDb(){
		System.out.println("初始化数据库成功");
	}

	@Autowired
	private EntityManager em;
	@Test
	public void findone(){
		User user = em.find(User.class, 2);
		System.out.println(user);
	}
	@Test
	public void findall(){
		Query nativeQuery = em.createNativeQuery("SELECT * from t_user", User.class);
		List list = nativeQuery.getResultList();
		for (Object o : list) {
			System.out.println(o);
		}

	}

	@Autowired
	private UserInfoService userInfoService;
	@Test
	public void insert(){
		User user = new User();
		user.setPassword("123456");
		user.setUname("zhouyu");
		userInfoService.insertUser(user);
	}

	@Test
	public void updata(){
        User user = new User();
        user.setUid(1);
        user.setUname("lisi");
        System.out.println(userInfoService.updataUser(user));
    }
}
