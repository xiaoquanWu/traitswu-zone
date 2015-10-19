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
    public void delete(String userName, String password) {
        User user = userDao.getUser(userName, password);
        userDao.delete(user);
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }

    @Override
    public User getUser(String userName, String password) {
        return this.userDao.getUser(userName, password);
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
