package com.traitswu.zone.entity;

import java.util.List;

/**
 * Created by XiaoQuan on 2015/10/8.
 */
public class Article extends Domain {

    private String title;
    private byte[] content;
    private List<String> comments;

    private User user;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
