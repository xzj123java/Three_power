package com.xa.test;

import com.xa.roleInfo.service.RoleServic;
import com.xa.pojo.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRole {
    public static void main(String[] args) {
        ApplicationContext context=  new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        RoleServic roleServic = context.getBean(RoleServic.class);
        /* List<Role> roles= roleServic.selectroleall();
        for (Role roless:
             roles) {
            System.out.println(roless);
        }
*/
//        //增加
//        Role role = new Role();
//        role.setRole_name("销售管理");
//        roleServic.addrole(role);
//        System.out.println("添加成功");
        //删除
        /*roleServic.deleterole(2);
        System.out.println("删除成功");*/
     /*   //条件查询
        Role role = new Role();
        role.setRole_id(1);
        List<Role> roles = roleServic.selectif();
        for (Role roless:
                roles) {
            System.out.println(roless);
        }*/
  //先查在改
        Role role1 = roleServic.selectid(1);
        role1.setRole_name("总经理");
        roleServic.updaterole(role1);
        System.out.println("修改成功");


    }
}
