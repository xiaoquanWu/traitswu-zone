package com.traitswu.zone.dao.impl;

import com.traitswu.zone.dao.BaseDao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

    private SessionFactory sessionFactory;


    @Override
    public void save(T t) {
        getSession().save(t);

    }

    @Override
    public void update(T t) {
        getSession().update(t);

    }

    @Override
    public void delete(T t) {
        getSession().delete(t);
    }

    @Override
    public void delete(Integer id) {
        T t = (T) getSession().load(getClz(), id);
        this.delete(t);
    }

    @Override
    public List<T> list() {
        Criteria criteria = getSession().createCriteria(getClz());
        return (List<T>)criteria.list();
    }

    protected Class<?> getClz() {
        return ((Class<?>)
                (((ParameterizedType) (this.getClass().getGenericSuperclass())).getActualTypeArguments()[0]));
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    protected Criteria getCriteria(){
        return getSession().createCriteria(getClz());
    }

}
