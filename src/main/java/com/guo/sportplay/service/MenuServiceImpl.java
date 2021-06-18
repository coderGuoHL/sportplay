package com.guo.sportplay.service;

import com.guo.sportplay.bean.MainMenu;
import com.guo.sportplay.dao.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDao menuDao;

    @Override
    public List<MainMenu> getMenus() {
        return menuDao.getMenus();
    }
}
