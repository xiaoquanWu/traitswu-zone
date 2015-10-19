package com.traitswu.zone.dao.impl;

import com.traitswu.zone.dao.ArticleDao;
import com.traitswu.zone.entity.Article;
import org.hibernate.Query;

import java.util.List;

/**
 * Created by XiaoQuan on 2015/10/16.
 */
public class ArticleDaoImpl extends BaseDaoImpl<Article> implements ArticleDao {
    @Override
    public void deleteByGroup(String groupName) {
        //TODO: delete by HQL
//        Query query = getSession().createQuery("delete from Article as atc where atc.id in (select a.id from Article as a where a.articleGroup.groupName=:groupName)");
//        query.setParameter("groupName", groupName);
//        query.executeUpdate();


      /*  I don't know why?????? Below is error*/
//        Query query = getSession().createQuery("delete from Article as a where a.articleGroup.groupName =:groupName");
//        query.setParameter("groupName", groupName);
//        query.executeUpdate();

        for (Article article : list(groupName)) {
            super.delete(article);
        }

    }

    @Override
    public List<Article> list(String groupName) {
        Query query = getSession().createQuery("from Article as a where a.articleGroup.groupName=:groupName");
        query.setParameter("groupName", groupName);
        return (List<Article>)query.list();
    }

    @Override
    public Article getById(Integer id) {
        return (Article) getSession().get(getClz(), id);
    }
}
