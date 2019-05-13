package com.xa.UserInfo.controller;

import com.xa.UserInfo.service.UserServic;
import com.xa.pojo.UserInfo;
import jdk.nashorn.api.scripting.ScriptUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class UserInfoController {

    @Autowired
    UserServic userServic;

    @RequestMapping("a")
    public void init() {
        System.out.println("hello");
    }

    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "hello";
    }

    //查看所有的数据显示到页面(管理员用)
    @RequestMapping(value = "selectUserInfo", method = RequestMethod.POST)
    @ResponseBody//17.@ResponseBody注解会以json的方式返回数据，无论你是什么类型的对象。
    public Object getAllUserInfo() {
        return userServic.getAllUserInfo();
    }


    //前台页面向后台传值
    @RequestMapping("selectif")
    @ResponseBody
    public Boolean selectif(@RequestParam String user_name, @RequestParam String user_pas) {
        System.out.println("名字" + user_name + "密码" + user_pas);
        return false;
    }

    //前台传一个对象 @RequestBody传对象
    @RequestMapping("addUserInfo")
    @ResponseBody
    public Boolean addUserInfo(@RequestBody UserInfo userInfo) {
        //userServic.addUserInfo(userInfo);
        return false;
    }

    //登录验证的实现
    @RequestMapping("selectUserInfo1")
    @ResponseBody
    private Boolean selectUserInfo1(@RequestParam String user_name, @RequestParam String user_pas, HttpSession httpSession) {
        System.out.println(user_name);
        System.out.println(httpSession);
        UserInfo userInfo = new UserInfo();
        userInfo.setUser_name(user_name);
        userInfo.setUser_pas(user_pas);
        System.out.println(this.userServic.selectUserInfo1(userInfo));
        boolean flag = this.userServic.selectUserInfo1(userInfo);
        System.out.println("flag" + flag);
        if (flag) {
            httpSession.setAttribute("user", userInfo);
        }
        System.out.println(flag);
        return flag;
    }

    @RequestMapping("selectUsername_email")
    @ResponseBody
    private Boolean selectUsername_email(@RequestParam String user_name, @RequestParam String user_pas, @RequestParam String user_email) {
        System.out.println(user_email);
        UserInfo userInfo = new UserInfo();
        userInfo.setUser_name(user_name);
        userInfo.setUser_pas(user_pas);
        userInfo.setUser_email(user_email);
        return this.userServic.selectUsername_email(userInfo);
    }

    //*修改先查值*//*
    @RequestMapping(value = "/selectid")
    @ResponseBody
    public UserInfo getSelectid(@RequestParam Integer user_id) {
        System.out.println("查询" + user_id);
        return userServic.selectid(user_id);
    }

    /*修改*/
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    @ResponseBody
    public void updateUser(@RequestBody UserInfo userInfo) {
        System.out.println(userInfo);
        userServic.updateUserInfo(userInfo);
    }

    /*删除用户*/
    @RequestMapping(value = "/delete")
    @ResponseBody
    public void deleteUser(@RequestParam Integer user_id) {
        System.out.println("删除" + user_id);
        userServic.deleteUserById(user_id);
    }

    /*模糊查询*/
    @RequestMapping(value = "/like", method = RequestMethod.POST)
    @ResponseBody
    private List<UserInfo> Likeuser(@RequestParam String like) {
        return userServic.Likeuser(like);
    }

}
