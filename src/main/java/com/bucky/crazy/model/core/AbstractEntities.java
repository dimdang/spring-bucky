package com.bucky.crazy.model.core;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Dang Dim
 * Date     : 12-Dec-17, 1:24 PM
 * Email    : d.dim@gl-f.com
 */

@MappedSuperclass
public abstract class AbstractEntities implements Serializable, Cloneable{

    protected Long id;
    protected String code;
    protected String desc;

    @JsonIgnore
    protected String userCreate;
    @JsonIgnore
    protected Date createDate;
    @JsonIgnore
    protected String userUpdate;
    @JsonIgnore
    protected Date updateDate;

    @Transient
    public abstract Long getId();

    public void setId(Long id) {
        this.id = id;
    }

    @Transient
    public abstract String getCode();

    public void setCode(String code) {
        this.code = code;
    }

    @Transient
    public abstract String getDesc();

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Column(name = "usr_create")
    public String getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(String userCreate) {
        this.userCreate = userCreate;
    }

    @Column(name = "cre_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "usr_update")
    public String getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(String userUpdate) {
        this.userUpdate = userUpdate;
    }

    @Column(name = "upd_date")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
