package com.guo.sportplay.dao;

import com.guo.sportplay.bean.MainMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MenuDao {
    public List<MainMenu> getMenus();
}
