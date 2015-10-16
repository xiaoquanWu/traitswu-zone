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
        user.setUserName("user" + new Random().nextInt(111));
        user.setPassWord("password" + new Random().nextInt(111));
        userService.save(user);
    }

    @Test
    public void testList() {
        List<User> list = userService.list();
        System.out.println(list.size());
    }

}