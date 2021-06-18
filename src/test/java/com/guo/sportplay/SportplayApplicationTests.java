package com.guo.sportplay;

import com.guo.sportplay.bean.MainMenu;
import com.guo.sportplay.bean.User;
import com.guo.sportplay.dao.MenuDao;
import com.guo.sportplay.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class SportplayApplicationTests {
    @Autowired
    UserDao userDao;
    @Autowired
    DataSource dataSource;

    @Autowired
    MenuDao menuDao;
    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getConnection());
    }

    @Test
    void test1() {
        User admin = userDao.getUserByMessage("admin", "123456");
        System.out.println("admin=>" + admin);
    }

    @Test
    void test2() {
        User user = userDao.getById(1);
        System.out.println("admin=>" + user);
    }

    @Test
    public void testMenuDao() {
        for (MainMenu menu : menuDao.getMenus()) {
            System.out.println(menu);
        }
    }
    @Test
    public void testUpdateUser() {
        userDao.updateState(2, true);

    }

    @Test
    public void testAddUser() {
        User user = new User("test1",
                                "test1", "test1","test1",true);
        System.out.println(user);
        int flag = userDao.addUser(user);
        System.out.println(flag);
    }

    @Test
    public void testDelete() {
        System.out.println(userDao.deleteUser(11));
    }
}
