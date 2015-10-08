package com.traitswu.zone.entity;

import com.traitswu.zone.AbstractTestSupport;
import org.hibernate.Session;
import org.junit.Test;

import java.util.Random;

/**
 * Created by XiaoQuan on 2015/10/8.
 */
public class UserTest extends AbstractTestSupport{


    @Override
    @Test
    public void testSave() throws Exception {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();

        User user = new User();
        user.setUserName("TT1"+ new Random().nextInt(120));
        user.setPassWord("QQ1"+ new Random().nextInt(120));

        session.save(user);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void testQuery() throws Exception {

    }

    @Override
    public void testDelete() throws Exception {

    }

    @Override
    public void testUpdate() throws Exception {

    }

}