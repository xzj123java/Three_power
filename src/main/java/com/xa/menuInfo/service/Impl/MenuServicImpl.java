package com.xa.menuInfo.service.Impl;

import com.xa.menuInfo.Mapper.MenuMapper;
import com.xa.menuInfo.dto.MenuDto;
import com.xa.menuInfo.service.MenuServic;
import com.xa.menuInfo.vo.ImpowerVo;
import com.xa.pojo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuServicImpl implements MenuServic {
    @Autowired
    MenuMapper menuMapper;
    @Transactional
    public List<MenuDto> selectmenuallDto(int id) {
        return menuMapper.selectmenuallDto(id);
    }
    @Transactional
    public boolean impower(ImpowerVo impowerVo) {
        System.out.println("这边接到了");
        System.out.println(impowerVo);
        /*
        * 实际操作逻辑
        * 1.删除role_id中间表的数据 (添加删除SQL语句)
        * 2.再添role_id和menus循环在中间表插入数据
        * */
        //1.删除role_id中间表的数据 (添加删除SQL语句)
        System.out.println(impowerVo.getRole_id());
        menuMapper.impowerRole_idDelete(impowerVo.getRole_id());

        //2.再添role_id和menus循环在中间表插入数据
        System.out.println("添加对象");
        System.out.println(impowerVo);
        menuMapper.batchSave(impowerVo);

        return  true;
    }

    @Transactional
    public void addmenu(Menu menu) {
        menuMapper.addmenu(menu);
    }

    @Transactional
    public void deletemenu(int id) {

    }

    @Transactional
    public List<Menu> selectif() {
        return null;
    }

    @Transactional
    public Menu selectid(int id) {
        return null;
    }

    @Transactional
    public void updatemenu(Menu menu) {

    }
}
