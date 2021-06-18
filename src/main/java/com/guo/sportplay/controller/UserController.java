package com.guo.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.guo.sportplay.bean.User;
import com.guo.sportplay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/allUser")
    public String allUsers(String query, int pageNum, int pageSize) {
        List<User> allUsers;
        int count;
        int startIndex = (pageNum - 1) * pageSize;
        String queryStr = "%" + query + "%";
        if("".equals(query)) {
            allUsers = userService.getAllUsers(null, startIndex, pageSize);
            count = userService.getUserCount(null);
        } else  {
            allUsers = userService.getAllUsers(queryStr, startIndex, pageSize);
            count = userService.getUserCount(queryStr);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("userList", allUsers);
        map.put("numbers", count);
        return JSON.toJSONString(map);
    }

    @PutMapping("/userState")
    public String updateState(int id, Boolean state) {
        Boolean flag = userService.updateState(id, state);
        return flag?"success":"error";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") int userId) {
        Boolean flag = userService.deleteUser(userId);
        return flag?"success":"error";
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user) {
        System.out.println(user);
        user.setRole("普通用户");
        user.setState(false);
        Boolean flag = userService.addUser(user);
        return flag?"success":"error";
    }
}
