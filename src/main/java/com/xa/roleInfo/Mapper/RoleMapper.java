package com.xa.roleInfo.Mapper;

import com.xa.pojo.Role;

import java.util.List;

public interface RoleMapper {
    //查
    public List<Role> selectroleall();
    //增
    public void addrole(Role role);
    //删
    public void deleterole(int id);
    //条件查询
    public List<Role> selectif();
    Role selectid(int id);
    void updaterole(Role role);


}
