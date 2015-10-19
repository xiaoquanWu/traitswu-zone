package com.traitswu.zone.service;

import com.traitswu.zone.entity.Article;

import java.util.List;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public interface ArticleService {

    void save(Article article);

    void delete(Integer id);

    Article getArticle(Integer id, boolean loadComments);

    void deleteByGroup(String groupName);

    List<Article> list(String groupName);

}
