package com.xa.menuInfo.Mapper;

import com.xa.menuInfo.dto.MenuDto;
import com.xa.menuInfo.vo.ImpowerVo;
import com.xa.pojo.Menu;

import java.util.List;

public interface MenuMapper {
    //查
    public List<MenuDto> selectmenuallDto(int id);//

    public void impowerRole_idDelete(int id);

    //1.Mybatis批量操作 2.修改Mapper.xml文件，添加如下节点：
    public void batchSave(ImpowerVo impowerVo);

    //增
    public void addmenu(Menu menu);

    //删
    public void deletemenu(int id);

    //条件查询
    public List<Menu> selectif();

    Menu selectid(int id);

    void updatemenu(Menu menu);
}
