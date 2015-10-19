package com.traitswu.zone.dao.impl;

import com.traitswu.zone.dao.UserDao;
import com.traitswu.zone.entity.User;
import org.hibernate.Query;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    @Override
    public User getUser(String userName, String password) {
        Query query = getSession().createQuery("from User as user where user.userName=:userName and user.passWord=:password");
        query.setParameter("userName", userName);
        query.setParameter("password", password);
        return (User)query.uniqueResult();
    }
}
