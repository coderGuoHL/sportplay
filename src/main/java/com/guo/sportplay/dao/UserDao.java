package com.guo.sportplay.dao;

import com.guo.sportplay.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    public User getById(@Param("id") int id);

    public User getUserByMessage(@Param("username")String name, @Param("password")String password);

    public List<User> getAllUsers(@Param("username")String name, @Param("pageStart")int pageStart, @Param("pageSize")int pageSize);

    public int getUserCount(@Param("username")String name);


    public int updateState(int id, Boolean state);

    /**
     * 添加用户
     */
    public int addUser(User user);

    public int deleteUser(int id);
}
