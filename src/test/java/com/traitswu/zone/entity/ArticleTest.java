package com.traitswu.zone.entity;

import com.google.common.collect.Lists;
import com.traitswu.zone.AbstractTestSupport;
import org.hibernate.Session;
import org.junit.Test;

import java.util.Random;

/**
 * Created by XiaoQuan on 2015/10/10.
 */
public class ArticleTest extends AbstractTestSupport {

    @Override
    @Test
    public void testSave() throws Exception {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();

        User user = new User();
        user.setPassWord("aa" + new Random().nextInt(130));
        user.setUserName("bb" + new Random().nextInt(130));

        ArticleGroup articleGroup = new ArticleGroup();
        articleGroup.setGroupName("Java");


        Article article = new Article();
        article.setComments(Lists.newArrayList("C1", "C2"));
        article.setTitle("First Article");

        article.setContent("HelloWorld".getBytes());
        article.setUser(user);
        article.setArticleGroup(articleGroup);

        session.save(article);


        session.getTransaction().commit();
        session.close();

    }

    @Override
    @Test
    public void testQuery() throws Exception {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();

        Article article = (Article) session.get(Article.class, 4);

        System.out.println(article.getTitle());
        System.out.println(new String(article.getContent()));

        System.out.println(article.getUser().getUserName());

//        article.getUser().setUserName("AAAAA");
        System.out.println(article.getComments());

        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void testDelete() throws Exception {

    }

    @Override
    public void testUpdate() throws Exception {

    }
}