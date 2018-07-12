package com.dmxiaoshen.a.model;

import java.io.Serializable;

/**
 * Created by hzhsg on 2018/1/9.
 */
public class User implements Serializable {
    private static final long serialVersionUID = -5240917587115739546L;

    private String id;

    private Integer age;

    private String mobilePhone;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
