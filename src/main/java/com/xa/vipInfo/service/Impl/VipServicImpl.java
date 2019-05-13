package com.xa.vipInfo.service.Impl;

import com.xa.pojo.Vip;
import com.xa.vipInfo.Mapper.VipInfoMapper;
import com.xa.vipInfo.service.VipServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service//声明事务
public class VipServicImpl implements VipServic {
    @Autowired//两层建立连
            VipInfoMapper vipInfoMapper;

    /*添加Vip用户*/
    public void addVip(Vip vip) {
        vipInfoMapper.addVip(vip);

    }
}
