package com.xa.test;

import com.xa.UserInfo.service.UserServic;
import com.xa.pojo.UserInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
//        托管

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        UserServic userServic = context.getBean(UserServic.class);
        Object UserInfos=userServic.getAllUserInfo();
        System.out.println(UserInfos);
        userServic.deleteUserById(4);
        System.out.println("删除成功");

//        //添加
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUser_name("谢志剑");
//        userInfo.setUser_pas("123456");
//        userInfo.setUser_email("1913294487@qq.com");
//        userServic.addUserInfo(userInfo);
//        System.out.println("添加成功");
/*        UserInfo userInfo = new UserInfo();
        userInfo.setUser_id(3);
        userInfo.setUser_name("张之洞");
        userInfo.setUser_pas("123456");
        userInfo.setUser_email("1913294487@qq.com");
        userServic.updateUserInfo(userInfo);
        System.out.println("修改成功");*/


        /*UserInfo userInfo = new UserInfo();
        userInfo.setUser_email("1913294487@qq.com");
        userInfo.setUser_name("张之洞");
        List<UserInfo> userInfos =userServic.selectUserInfo(userInfo);
        for (UserInfo userInfos1:
                userInfos ) {
            System.out.println(userInfos1);
        }*/
  /*      UserInfo userInfo = userServic.selectid(3);
        userInfo.setUser_name("谭世同");
        userInfo.setUser_pas("123456");
        userInfo.setUser_email("1913294487@qq.com");
        userServic.updateUserInfo(userInfo);
        System.out.println("修改成功");*/
    }
}
