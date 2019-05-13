package com.xa.menuInfo.service;

import com.xa.menuInfo.dto.MenuDto;
import com.xa.menuInfo.vo.ImpowerVo;
import com.xa.pojo.Menu;

import java.util.List;

public interface MenuServic {
    //查
    public List<MenuDto> selectmenuallDto(int id);

    public  boolean impower(ImpowerVo impowerVo);
    //增
    public void addmenu(Menu menu);
    //删
    public void deletemenu(int id);
    //条件查询
    public List<Menu> selectif();
    Menu selectid(int id);
    void updatemenu(Menu menu);
}
