package com.guo.sportplay.service;

import com.guo.sportplay.bean.User;
import com.guo.sportplay.dao.UserDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
   public User getUserByMessage(String name, String password);

   public List<User> getAllUsers(String name, int pageStart, int pageSize);

   public int getUserCount(String name);

   public Boolean updateState(int id, Boolean state);

   public Boolean addUser(User user);

   public Boolean deleteUser(int id);
}
