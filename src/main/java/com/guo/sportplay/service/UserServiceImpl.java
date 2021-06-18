package com.guo.sportplay.service;

import com.guo.sportplay.bean.User;
import com.guo.sportplay.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    /**
     * 验证用户名密码是否正确
     * */
    @Override
    public User getUserByMessage(String name, String password) {
        return userDao.getUserByMessage(name, password);
    }

    @Override
    public List<User> getAllUsers(String name, int pageStart, int pageSize) {
        return userDao.getAllUsers(name, pageStart, pageSize);
    }

    @Override
    public int getUserCount(String name) {
        return userDao.getUserCount(name);
    }

    @Override
    public Boolean updateState(int id, Boolean state) {
        return userDao.updateState(id, state) > 0;
    }

    @Override
    public Boolean addUser(User user) {
        return userDao.addUser(user) > 0;
    }

    @Override
    public Boolean deleteUser(int id) {
        return userDao.deleteUser(id) > 0;
    }
}
