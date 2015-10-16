package com.traitswu.zone.dao;

import com.traitswu.zone.entity.ArticleGroup;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public interface ArticleGroupDao extends BaseDao<ArticleGroup> {

     ArticleGroup get(String groupName);

}
