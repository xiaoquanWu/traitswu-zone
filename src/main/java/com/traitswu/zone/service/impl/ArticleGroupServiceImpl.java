package com.traitswu.zone.service.impl;

import com.traitswu.zone.dao.ArticleDao;
import com.traitswu.zone.dao.ArticleGroupDao;
import com.traitswu.zone.entity.Article;
import com.traitswu.zone.entity.ArticleGroup;
import com.traitswu.zone.service.ArticleGroupService;
import org.hibernate.Hibernate;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public class ArticleGroupServiceImpl implements ArticleGroupService {

    private ArticleGroupDao articleGroupDao;
    private ArticleDao articleDao;

    @Override
    public void save(ArticleGroup articleGroup) {
        this.articleGroupDao.save(articleGroup);
    }

    @Override
    public void delete(String groupName) {
//        this.articleDao.deleteByGroup(groupName);
//        for (Article article : articleDao.list(groupName)) {
//            articleDao.delete(article);
//        }

        this.articleGroupDao.delete(groupName);
    }

    @Override
    public ArticleGroup get(String groupName) {
        return articleGroupDao.get(groupName);
    }


    public void setArticleGroupDao(ArticleGroupDao articleGroupDao) {
        this.articleGroupDao = articleGroupDao;
    }

    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }
}
