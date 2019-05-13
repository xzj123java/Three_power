package com.xa.roleInfo.controller;

import com.xa.pojo.Role;
import com.xa.roleInfo.service.RoleServic;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.management.relation.RoleInfo;

import java.util.List;

import static org.junit.Assert.*;

public class RoleInfoControllerTest {
    RoleServic bean;
    @Before
    public void setUp() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        bean =context.getBean(RoleServic.class);
    }

    @Test
    public void selectroleall() {
        List<Role> roleInfos = bean.selectroleall();
        for (Role role:
             roleInfos) {
            System.out.println(role);
        }
    }
}