package com.traitswu.zone.service;

import com.traitswu.zone.entity.ArticleGroup;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public interface ArticleGroupService {

    void save(ArticleGroup articleGroup);
    void delete(String groupName);

    ArticleGroup get(String groupName);

}
