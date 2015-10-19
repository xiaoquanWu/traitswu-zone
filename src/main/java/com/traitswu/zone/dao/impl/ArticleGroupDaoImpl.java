package com.traitswu.zone.dao.impl;

import com.traitswu.zone.dao.ArticleGroupDao;
import com.traitswu.zone.entity.ArticleGroup;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public class ArticleGroupDaoImpl extends BaseDaoImpl<ArticleGroup> implements ArticleGroupDao {
    @Override
    public ArticleGroup get(String groupName) {
        Criteria criteria = getCriteria();
        criteria.add(Restrictions.eq("groupName", groupName));
        return (ArticleGroup)criteria.uniqueResult();
    }

    @Override
    public Integer delete(String groupName) {
        Query query = getSession().createQuery("delete from ArticleGroup as ag where ag.groupName=:groupName");
        query.setParameter("groupName", groupName);
        return query.executeUpdate();

    }
}
