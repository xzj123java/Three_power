package com.xa.UserInfo.service;

import com.xa.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserServic {
     List<UserInfo> getAllUserInfo();
    Boolean deleteUserById(int id);//删除用户
     void addUserInfo(UserInfo userInfo);
     UserInfo selectid(int id);//id查询用户
     void updateUserInfo(UserInfo userInfo);//修改用户
     List<UserInfo> selectUserInfo(UserInfo userInfo);//条件查询
     Boolean selectUserInfo1(UserInfo userInfo);
     Boolean  selectUsername_email (UserInfo userInfo);//注册重复
    List<UserInfo> Likeuser (@Param("like") String like);//模糊查询
}
