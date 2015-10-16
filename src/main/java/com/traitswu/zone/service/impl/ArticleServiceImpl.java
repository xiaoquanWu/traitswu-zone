package com.traitswu.zone.service.impl;

import com.traitswu.zone.dao.ArticleDao;
import com.traitswu.zone.entity.Article;
import com.traitswu.zone.service.ArticleService;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public class ArticleServiceImpl implements ArticleService {
    private ArticleDao articleDao;

    @Override
    public void save(Article article) {
        articleDao.save(article);

    }

    @Override
    public void delete(Integer id) {
        articleDao.delete(id);
    }

    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }
}
