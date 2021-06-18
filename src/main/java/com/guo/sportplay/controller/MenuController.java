package com.guo.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.guo.sportplay.bean.MainMenu;
import com.guo.sportplay.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MenuController {
    @Autowired
    MenuService menuService;
    @RequestMapping("/menus")
    public String getMenus() {
        List<MainMenu> menus = menuService.getMenus();
        Map<String, Object> map = new HashMap<>();
        map.put("status", 500);
        if(menus != null) {
            map.put("status", 200);
            map.put("menus", menus);
        }

        String res_json = JSON.toJSONString(map);
        return res_json;
    }
}
