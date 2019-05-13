package com.xa.vipInfo.controller;

import com.xa.pojo.UserInfo;
import com.xa.pojo.Vip;


import com.xa.vipInfo.Mapper.VipInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VipInfoController {
    @Autowired
    VipInfoMapper vipInfoDao;
    /*新增加VIp POST提交*/
    @RequestMapping(value = "/addVip", method = RequestMethod.POST)
    public void addVip(@RequestBody Vip vip) {//传
        vipInfoDao.addVip(vip);
    }

}
