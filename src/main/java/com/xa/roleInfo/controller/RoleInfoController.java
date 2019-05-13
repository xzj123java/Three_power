package com.xa.roleInfo.controller;

import com.xa.roleInfo.service.RoleServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleInfoController {//没有变色要配置
    @Autowired
    RoleServic roleServic;

    /*查所有*/
    @RequestMapping(value = "selectroleall", method = RequestMethod.POST)
    public Object selectroleall() {
        return roleServic.selectroleall();
    }
}