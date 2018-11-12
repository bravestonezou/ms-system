package com.stone.ms.service;

import com.stone.ms.entity.MsUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/12 21:05
 * @Email zou.shiyong@frontsurf.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MsUserServiceTest {

    @Autowired
    private MsUserService msUserService;

    @Test
    public void insert() throws Exception {
        MsUser msUser = new MsUser();
        msUser.setUsername("zhangsan");
        msUser.setUseraccount("sansan");
        msUser.setUserpassword("111111");
        msUser.setUsersex(0);
        msUser.setUserage(20);
        msUser.setUseraddress("深圳市");
        msUser.setUseremail("1111@qq.com");
        msUserService.insert(msUser);
    }

    @Test
    public void findAll() throws Exception {
        List<MsUser> users = msUserService.findAll();
        for (MsUser user :
                users) {
            System.out.println(user);
        }
    }

    @Test
    public void findById() throws Exception {
        MsUser msUser = msUserService.findById(1);
        System.out.println(msUser);
    }

    @Test
    public void update() throws Exception {
        MsUser msUser = msUserService.findById(1);
        System.out.println(msUser);
        msUser.setUsername("你好");
        msUserService.update(msUser);
        msUser = msUserService.findById(1);
        System.out.println(msUser);
    }

    @Test
    public void deleteById() throws Exception {
        msUserService.deleteById(1);
        List<MsUser> users = msUserService.findAll();
        System.out.println(users.size());
    }
}