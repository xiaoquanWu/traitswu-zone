package com.traitswu.zone;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * Created by XiaoQuan on 2015/10/8.
 */
public abstract class AbstractTestSupport {
    public SessionFactory getSessionFactory() throws Exception {

        Configuration cfg = new Configuration().configure();
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties()).build();
        SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }

    public abstract void testSave() throws Exception;

    public abstract void testQuery() throws Exception;

    public abstract void testDelete() throws Exception;

    public abstract void testUpdate() throws Exception;

}
