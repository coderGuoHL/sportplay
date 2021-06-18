package com.guo.sportplay.bean;

import java.util.List;

// 主导航
public class MainMenu {
    private int id;
    private String title;
    private String path;
    private List<SubMenu> menuList;

    public MainMenu() {
    }

    public MainMenu(int id, String title, String path, List<SubMenu> menuList) {
        this.id = id;
        this.title = title;
        this.path = path;
        this.menuList = menuList;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<SubMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<SubMenu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return "MainMenu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", menuList=" + menuList +
                '}';
    }
}
