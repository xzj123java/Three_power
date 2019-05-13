package com.xa.vipInfo.mapper;

import com.xa.UserInfo.Mapper.UserInfoMapper;
import com.xa.pojo.Vip;
import com.xa.vipInfo.Mapper.VipInfoMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class VipInfoMapperTest {
    VipInfoMapper bean;

    @Before
    public void setUp() throws Exception {
        ClassPathXmlApplicationContext cintest =
                new ClassPathXmlApplicationContext("spring-mybatis.xml");
        bean = cintest.getBean(VipInfoMapper.class);
    }

    @Test
    public void addVip() {
        Vip vip = new Vip();
        vip.setVname("谢志剑");
        vip.setVidcard(1234595444);
        vip.setVphone(1776471612);
        bean.addVip(vip);
        System.out.println("添加VIP成功");
    }
}