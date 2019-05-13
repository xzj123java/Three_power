package com.xa.roleInfo.service;

import com.xa.pojo.Role;

import java.util.List;

public interface RoleServic {
    public List<Role> selectroleall( );
    public void addrole(Role role);
    public void deleterole(int id);
    public List<Role> selectif();
    Role selectid(int id);
    void updaterole(Role role);

}
