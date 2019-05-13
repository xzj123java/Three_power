package com.xa.pojo;

import java.util.List;

public class Menu {
    int menu_id;
    String menu_name;
    String menu_ico;//图标
    String menu_url;//跳转地址
    int fatherid;//上级菜单
    List<Menu>children;//子菜单
    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_ico() {
        return menu_ico;
    }

    public void setMenu_ico(String menu_ico) {
        this.menu_ico = menu_ico;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public int getFatherid() {
        return fatherid;
    }

    public void setFatherid(int fatherid) {
        this.fatherid = fatherid;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menu_id=" + menu_id +
                ", menu_name='" + menu_name + '\'' +
                ", menu_ico='" + menu_ico + '\'' +
                ", menu_url='" + menu_url + '\'' +
                ", fatherid=" + fatherid +
                ", children=" + children +
                '}';
    }

    public Menu(int menu_id, String menu_name, String menu_ico, String menu_url, int fatherid, List<Menu> children) {
        this.menu_id = menu_id;
        this.menu_name = menu_name;
        this.menu_ico = menu_ico;
        this.menu_url = menu_url;
        this.fatherid = fatherid;
        this.children = children;
    }

    public Menu() {
    }
}
