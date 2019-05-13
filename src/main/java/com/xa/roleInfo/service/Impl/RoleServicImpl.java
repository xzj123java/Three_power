package com.xa.roleInfo.service.Impl;

import com.xa.roleInfo.Mapper.RoleMapper;
import com.xa.roleInfo.service.RoleServic;
import com.xa.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServicImpl implements RoleServic {
    @Autowired
    RoleMapper roleMapper;

    @Transactional
//    查所有
    public List<Role> selectroleall() {

        return roleMapper.selectroleall();
    }
    @Transactional
    public void addrole(Role role) {
        roleMapper.addrole(role);
    }
    @Transactional
    public void deleterole(int id) {
        roleMapper.deleterole(id);
    }
    @Transactional
    public List<Role> selectif() {
        return roleMapper.selectif();
    }
    @Transactional
    public Role selectid(int id ) {
        return roleMapper.selectid(id);
    }

    public void updaterole(Role role) {
        roleMapper.updaterole(role);
    }


}
