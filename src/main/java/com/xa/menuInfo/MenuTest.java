package com.xa.menuInfo;

import com.xa.menuInfo.dto.MenuDto;
import com.xa.menuInfo.service.MenuServic;
import com.xa.pojo.Menu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MenuTest {
    public static void main(String[] args) {
        ApplicationContext context=  new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        MenuServic menuServic = context.getBean(MenuServic.class);
        List<MenuDto> menuList = menuServic.selectmenuallDto(3);
        System.out.println(menuList);//查完之后把的到的数据传化为Dto
    }
}
