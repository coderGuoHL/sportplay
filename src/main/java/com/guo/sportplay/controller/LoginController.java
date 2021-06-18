package com.guo.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.guo.sportplay.bean.User;
import com.guo.sportplay.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
public class LoginController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user) {
        String flag = "error";
        User u = userDao.getUserByMessage(user.getUserName(), user.getPassword());
        HashMap<String, Object> map = new HashMap<>();
        if(u != null) {
            flag = "success";
        }
        map.put("flag", flag);
        map.put("user", u);
        String res_json = JSON.toJSONString(map);

        return res_json;
    }
}
