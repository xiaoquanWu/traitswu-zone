package com.traitswu.zone.service.impl;

import com.google.common.collect.Lists;
import com.traitswu.zone.entity.Article;
import com.traitswu.zone.entity.ArticleGroup;
import com.traitswu.zone.entity.User;
import com.traitswu.zone.service.ArticleService;
import com.traitswu.zone.support.TestSupport;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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
        user.setUserName("TTTTTTTTTTTT");
        user.setPassWord("PPPPPPPPPPPPP");

        ArticleGroup articleGroup = new ArticleGroup();
        articleGroup.setGroupName("GGGGGGGGGGGGGGGGGG");

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

    }
}