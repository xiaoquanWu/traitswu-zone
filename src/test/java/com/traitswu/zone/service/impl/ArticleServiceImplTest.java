package com.traitswu.zone.service.impl;

import com.google.common.collect.Lists;
import com.traitswu.zone.entity.Article;
import com.traitswu.zone.entity.ArticleGroup;
import com.traitswu.zone.entity.User;
import com.traitswu.zone.service.ArticleService;
import com.traitswu.zone.support.TestSupport;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public class ArticleServiceImplTest extends TestSupport {

    @Autowired
    private ArticleService articleService;

    @Test
    public void testSave() throws Exception {
        User user = new User();
        user.setUserName("U1");
        user.setPassWord("P1");

        ArticleGroup articleGroup = new ArticleGroup();
        articleGroup.setGroupName("G2");

        Article article = new Article();
        article.setUser(user);
        article.setArticleGroup(articleGroup);
        article.setTitle("TEST-FOR-2015");
        article.setComments(Lists.newArrayList("Good", "BAD"));
        article.setContent("What What".getBytes());

        articleService.save(article);

    }

    @Test
    public void testDelete() throws Exception {

        articleService.delete(1);

    }

    @Test
    public void testDeleteByGroup(){
        articleService.deleteByGroup("G2");
    }

    @Test
    public void testQuery() {
        Article article = articleService.getArticle(2, true);
        System.out.println(article.getTitle());
        System.out.println(article.getComments());
    }

    @Test
    public void testListByGroup() {
        List<Article> articles = articleService.list("G2");
        System.out.println(articles.size());
        for (Article article : articles) {
            System.out.println(article.getComments());
        }
    }
}