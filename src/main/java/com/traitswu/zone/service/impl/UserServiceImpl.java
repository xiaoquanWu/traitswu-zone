package com.traitswu.zone.service.impl;

import com.traitswu.zone.dao.UserDao;
import com.traitswu.zone.entity.User;
import com.traitswu.zone.service.UserService;

import java.util.List;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    @Override
    public void save(User user) {
        this.userDao.save(user);

    }

    @Override
    public void delete(Integer userId) {

    }

    @Override
    public List<User> list() {
        return userDao.list();
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
