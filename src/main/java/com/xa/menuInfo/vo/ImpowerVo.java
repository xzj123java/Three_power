package com.xa.menuInfo.vo;

import java.util.List;

public class ImpowerVo {
    int role_id;
    List<Integer> menus;

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public List<Integer> getMenus() {
        return menus;
    }

    public void setMenus(List<Integer> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "vo{" +
                "role_id=" + role_id +
                ", menus=" + menus +
                '}';
    }
}
