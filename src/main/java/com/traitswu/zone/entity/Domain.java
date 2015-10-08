package com.traitswu.zone.entity;

import java.util.Date;

/**
 * Created by XiaoQuan on 2015/10/8.
 */
public class Domain {

    private Integer id;
    private Date createDate;
    private Date modifiedDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
