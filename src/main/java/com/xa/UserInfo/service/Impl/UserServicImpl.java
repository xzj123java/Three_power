package com.xa.UserInfo.service.Impl;

import com.xa.UserInfo.Mapper.UserInfoMapper;
import com.xa.UserInfo.service.UserServic;
import com.xa.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service//声明一个事务
public class UserServicImpl implements UserServic {
    @Autowired//注入//建立连接 Servic 和 Dao
            UserInfoMapper userInfoDao;

    @Transactional
    public List<UserInfo> getAllUserInfo() {
        List<UserInfo> UserInfos = userInfoDao.getAllUserInfo();
        return UserInfos;
    }

    @Transactional
    public Boolean deleteUserById(int id) {
        userInfoDao.deleteUserById(id);
        if (userInfoDao.selectid(id) == null) {
            return true;
        }
        return false;
    }

    @Transactional
    public void addUserInfo(UserInfo userInfo) {

        userInfoDao.addUserInfo(userInfo);
    }
    /*定义查询的方法*/

    @Transactional
    /*修改用户先查询*/
    public UserInfo selectid(int id) {
        return userInfoDao.selectid(id);
    }

    @Transactional
    public void updateUserInfo(UserInfo userInfo) {
        userInfoDao.updateUserInfo(userInfo);
    }

    @Transactional
    public List<UserInfo> selectUserInfo(UserInfo userInfo) {
        return userInfoDao.selectUserInfo(userInfo);
    }

    @Transactional
    public Boolean selectUserInfo1(UserInfo userInfo) {
        List<UserInfo> userInfos = userInfoDao.selectUserInfo1(userInfo);
        if (userInfos != null && userInfos.size() > 0) {
            return true;
        }
        return false;
    }

    @Transactional
    public Boolean selectUsername_email(UserInfo userInfo) {
        List<UserInfo> userInfos = userInfoDao.selectUsername_email(userInfo);

        if (userInfos == null || userInfos.size() == 0) {
            //进来就添加
            userInfoDao.addUserInfo(userInfo);
            return true;
        }
        return false;
    }

    @Transactional
    public List<UserInfo> Likeuser(String like) {
        return userInfoDao.Likeuser(like);
    }

}
