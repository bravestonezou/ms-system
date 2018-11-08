package com.stone.ms.mapper;
import java.util.Date;
import java.util.List;

import com.stone.ms.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/8 21:44
 * @Email zou.shiyong@frontsurf.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void insert() throws Exception {
        User user = new User();
        user.setUsername("stone");
        user.setAge(20);
        user.setCtm(new Date());
        userMapper.insert(user);

    }

    @Test
    public void findAll() throws Exception {
        List<User> users = userMapper.findAll();
        for (User user :
                users) {
            System.out.println(user);
        }
    }

    @Test
    public void findById() throws Exception {
        User user = userMapper.findById(1);
        System.out.println(user);
    }

    @Test
    public void update() throws Exception {
        User u1 = userMapper.findById(1);
        User user = new User();
        user.setId(1);
        user.setUsername("zou");
        user.setAge(25);
        user.setCtm(new Date());
        userMapper.update(user);
        User u2 = userMapper.findById(1);
        System.out.println(u1);
        System.out.println(u2);
    }

    @Test
    public void deleteById() throws Exception {
        List<User> users1 = userMapper.findAll();
        userMapper.deleteById(1);
        List<User> users2 = userMapper.findAll();
        System.out.println(users1.size());
        System.out.println(users2.size());
    }



}