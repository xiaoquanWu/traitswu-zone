package com.traitswu.zone.dao;

import com.traitswu.zone.entity.Article;

import java.util.List;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public interface ArticleDao extends BaseDao<Article> {

    void deleteByGroup(String groupName);

    List<Article> list(String groupName);

    Article getById(Integer id);

}
