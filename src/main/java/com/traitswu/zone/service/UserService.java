package com.traitswu.zone.service;

import com.traitswu.zone.entity.User;

import java.util.List;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public interface UserService {

    void save(User user);
    void delete(Integer userId);
    List<User> list();

}
