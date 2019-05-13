package com.xa.menuInfo.controller;

import com.xa.menuInfo.dto.MenuDto;
import com.xa.menuInfo.service.MenuServic;
import com.xa.menuInfo.vo.ImpowerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MenuInfoController {
    @Autowired
    MenuServic menuServic;

    @RequestMapping("selectmenuallDto")
    public Object selectmenuallDto(@RequestParam int id) {
        List<MenuDto> menuInfo = menuServic.selectmenuallDto(id);
        for (int i = 0; i < menuInfo.size(); i++) {
            MenuDto menuDto = menuInfo.get(i);
            int total = menuDto.getChildren() != null ? menuDto.getChildren().size() : 0;
            int num = 0;
            if (total > 0) {
                for (int j = 0; j<menuDto.getChildren().size();j++){
                    MenuDto childDao = menuDto.getChildren().get(j);
                    if (childDao.getChecked()){
                        num++;
                    }
                }
            }
            if (num >0){
                menuDto.setChecked("true");
            }
        }
        return menuInfo;
    }

    @RequestMapping(value = "/impower", method = RequestMethod.POST)
    public Object impower(@RequestBody ImpowerVo impowerVo ){
        System.out.println(impowerVo);
        //1得到前端的值
        //2传值到Service
        return menuServic.impower(impowerVo);
    }
}
