package com.xa.UserInfo.Mapper;

import com.xa.UserInfo.service.UserServic;
import com.xa.pojo.UserInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class UserInfoMapperTest {
    UserInfoMapper bean;
    @Before
    public void setUp() throws Exception {
        ClassPathXmlApplicationContext cintest =
                new ClassPathXmlApplicationContext("spring-mybatis.xml");
        bean = cintest.getBean(UserInfoMapper.class);
    }

    @Test
    public void selectId() {
        UserInfo userInfos =  bean.selectid(3);
        System.out.println(userInfos);
    }

    @Test
    public void update() {
        UserInfo userInfos =  bean.selectid(12);
        userInfos.setUser_pas("123456");
        bean.updateUserInfo(userInfos);
    }

    @Test
    public void LIKE() {

        List<UserInfo> userInfos =bean.Likeuser("191");
        for (UserInfo userInfo:
             userInfos ) {
            System.out.println(userInfo);
        }
    }

    @After
    public void tearDown() throws Exception {

    }
}