package com.traitswu.zone.service.impl;

import com.traitswu.zone.dao.ArticleDao;
import com.traitswu.zone.dao.UserDao;
import com.traitswu.zone.entity.Article;
import com.traitswu.zone.entity.ArticleGroup;
import com.traitswu.zone.entity.User;
import com.traitswu.zone.service.ArticleGroupService;
import com.traitswu.zone.service.ArticleService;
import org.hibernate.Hibernate;

import java.util.List;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public class ArticleServiceImpl implements ArticleService {
    private ArticleDao articleDao;
    private UserDao userDao;
    private ArticleGroupService articleGroupService;

    @Override
    public void save(Article article) {
        String userName = article.getUser().getUserName();
        String passWord = article.getUser().getPassWord();
        User user = this.userDao.getUser(userName, passWord);

        ArticleGroup articleGroup = this.articleGroupService.get(article.getArticleGroup().getGroupName());
        //articleGroup is null , create new Group
        if (articleGroup != null) {
            article.setArticleGroup(articleGroup);
        }

        //user is null, throw Exception, do not create User.(different with articleGroup)
        if (user != null) {
            article.setUser(user);
            articleDao.save(article);
            return;
        }
        throw new IllegalStateException("User[" + userName + "] not found");

    }

    @Override
    public void update(Article article) {
    }

    @Override
    public void updateTitle(Integer id, String title) {
        Article article = articleDao.load(id);
        article.setTitle(title);
        articleDao.update(article);
    }


    @Override
    public void delete(Integer id) {
        articleDao.delete(id);
    }

    @Override
    public Article getArticle(Integer id, boolean loadComments) {
        Article article = articleDao.get(id);
        if (loadComments) {
            Hibernate.initialize(article.getComments());
        }
        return article;
    }

    @Override
    public void deleteByGroup(String groupName) {
        articleDao.deleteByGroup(groupName);
    }

    @Override
    public List<Article> list(String groupName) {
        return articleDao.list(groupName);
    }

    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setArticleGroupService(ArticleGroupService articleGroupService) {
        this.articleGroupService = articleGroupService;
    }
}
