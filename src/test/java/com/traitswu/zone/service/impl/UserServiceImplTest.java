package com.traitswu.zone.service.impl;

import com.traitswu.zone.entity.User;
import com.traitswu.zone.service.UserService;
import com.traitswu.zone.support.TestSupport;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Random;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public class UserServiceImplTest extends TestSupport {

    @Autowired
    private UserService userService;


    @Test
    public void testSave() {
        User user = new User();
        user.setUserName("U1");
        user.setPassWord("P1");
        userService.save(user);
    }

    @Test
    public void testList() {
        List<User> list = userService.list();
        System.out.println(list.size());
    }

    @Test
    public void testGetUser() {
        User user = userService.getUser("U1", "P1");
        System.out.println(user.getUserName());
    }

}