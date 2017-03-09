package com.bhn.exercise2.entity;

import java.util.Date;

/**
 * Created by djeremias on 3/7/17.
 */
public class BaseEntity {

    private Long id;
    private String name;
    private String description;
    private Boolean active = Boolean.FALSE;
    private Date createdDate;
    private Date updatedDate;

    public BaseEntity() {
        // empty ctor
    }

    public BaseEntity(String name, String description) {
        this.name = name;
        this.description = description;
        this.active = Boolean.TRUE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
