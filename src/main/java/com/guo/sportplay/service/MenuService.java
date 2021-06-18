package com.guo.sportplay.service;

import com.guo.sportplay.bean.MainMenu;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MenuService {
    public List<MainMenu> getMenus();
}
