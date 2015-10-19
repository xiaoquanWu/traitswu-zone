package com.traitswu.zone.dao;

import java.util.List;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public interface BaseDao<T> {

    void save(T t);

    void update(T t);

    void delete(T t);

    void delete(Integer id);

    List<T> list();


}
