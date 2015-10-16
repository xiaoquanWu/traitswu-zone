package com.traitswu.zone.service;

import com.traitswu.zone.entity.Article;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public interface ArticleService {

    void save(Article article);
    void delete(Integer id);

}
