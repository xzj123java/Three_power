package com.xa.UserInfo.controller;

import com.xa.UserInfo.service.UserServic;
import com.xa.menuInfo.service.MenuServic;
import com.xa.pojo.UserInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class UserInfoControllerTest {
    UserServic bean;

    @Before
    public void setUp() throws Exception {
        ClassPathXmlApplicationContext cintest =
                new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        bean = cintest.getBean(UserServic.class);
    }

    @Test
    public void getSelectid() {
        UserInfo userInfos = bean.selectid(3);
        System.out.println(userInfos);
    }

    @Test
    public void updateUser() {
        UserInfo userInfos = bean.selectid(12);
        userInfos.setUser_pas("123456789");
        bean.updateUserInfo(userInfos);
    }

    @Test
    public void deleteUser() {
       bean.deleteUserById(3);
        System.out.println("删除成功");
    }

    @Test
    public void Likeuser() {
        List<UserInfo> userInfos= bean.Likeuser("周");
        for (UserInfo userInfo:
             userInfos  ) {
            System.out.println(userInfo);
        }
    }
}