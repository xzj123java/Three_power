package com.xa.test;

import com.xa.menuInfo.service.MenuServic;
import com.xa.pojo.Menu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMenu {
    public static void main(String[] args) {
        ApplicationContext context=  new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        MenuServic menuServic = context.getBean(MenuServic.class);
       /* List<Menu> menus= menuServic.selectmenuall();
        for (Menu menuss:
             menus) {
            System.out.println(menuss);
        }
*/
        /*//增加
        Menu menu = new Menu();
        menu.setMenu_skip("跳转地址");
        menu.setMenu_superior(1);
        menu.setMenu_ico("图片");
        menu.setMenu_name("财务管理");
        menuServic.addmenu(menu);
        System.out.println("添加成功");*/
        //删除
        /*menuServic.deletemenu(2);
        System.out.println("删除成功");*/
     /*   //条件查询
        menu menu = new menu();
        menu.setmenu_id(1);
        List<menu> menus = menuServic.selectif();
        for (menu menuss:
                menus) {
            System.out.println(menuss);
        }*/
        //先查在改
        /*Menu menu1 = menuServic.selectid(1);
        menu1.setMenu_name("总经理");
        menuServic.updatemenu(menu1);
        System.out.println("修改成功");*/


    }
}
