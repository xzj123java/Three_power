package com.xa.menuInfo.service.Impl;

import com.xa.menuInfo.dto.MenuDto;
import com.xa.menuInfo.service.MenuServic;
import com.xa.menuInfo.vo.ImpowerVo;
import com.xa.pojo.Menu;
import com.xa.pojo.UserInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MenuServicImplTest {
    MenuServic bean;
    @Before
    public void setUp() throws Exception {
        ClassPathXmlApplicationContext cintest =
                new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
         bean = cintest.getBean(MenuServic.class);
    }

    @Test
    public void selectmenuallDto() {

        List<MenuDto> menuDtos = bean.selectmenuallDto(1);
        System.out.println(menuDtos);
    }

    @Test
    public void impower() {
        ImpowerVo impowerVo = new ImpowerVo();
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        impowerVo.setMenus(integers);
        impowerVo.setRole_id(2);
        bean.impower(impowerVo);

    }
}