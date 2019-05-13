package com.xa.UserInfo.Mapper;

import com.xa.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
    public List<UserInfo> getAllUserInfo();
    public void deleteUserById(int id);//删除用户
    public void addUserInfo(UserInfo userInfo);//添加用户
    public UserInfo selectid(int id);//ID插叙用户
    public void updateUserInfo(UserInfo userInfo);//修改用户
    public List<UserInfo> selectUserInfo(UserInfo userInfo);//条件查询
    public List<UserInfo> selectUserInfo1(UserInfo userInfo);
     List<UserInfo>  selectUsername_email (UserInfo userInfo);//注册重复
    List<UserInfo> Likeuser (@Param("like") String like);//模糊查询
}
