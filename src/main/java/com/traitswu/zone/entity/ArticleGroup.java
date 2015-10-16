package com.traitswu.zone.entity;

import java.util.List;

/**
 * Created by XiaoQuan on 2015/10/8.
 */
public class ArticleGroup extends Domain {

    private String groupName;

    private List<Article> articles;

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
