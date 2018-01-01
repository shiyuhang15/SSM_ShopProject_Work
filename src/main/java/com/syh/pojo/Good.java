package com.syh.pojo;

import java.io.Serializable;
import java.util.Date;

public class Good implements Serializable {
    private int id;
    private String good_id;
    private String good_name;
    private String good_type;
    private String buss_name;
    private Date good_createtime;
    private String good_imageurl;
    private String good_isfree;
    private String good_ischange;

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", good_id='" + good_id + '\'' +
                ", good_name='" + good_name + '\'' +
                ", good_type='" + good_type + '\'' +
                ", buss_name='" + buss_name + '\'' +
                ", good_createtime=" + good_createtime +
                ", good_imageurl='" + good_imageurl + '\'' +
                ", good_isfree='" + good_isfree + '\'' +
                ", good_ischange='" + good_ischange + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGood_id() {
        return good_id;
    }

    public void setGood_id(String good_id) {
        this.good_id = good_id;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    public String getGood_type() {
        return good_type;
    }

    public void setGood_type(String good_type) {
        this.good_type = good_type;
    }

    public String getBuss_name() {
        return buss_name;
    }

    public void setBuss_name(String buss_name) {
        this.buss_name = buss_name;
    }

    public Date getGood_createtime() {
        return good_createtime;
    }

    public void setGood_createtime(Date good_createtime) {
        this.good_createtime = good_createtime;
    }

    public String getGood_imageurl() {
        return good_imageurl;
    }

    public void setGood_imageurl(String good_imageurl) {
        this.good_imageurl = good_imageurl;
    }

    public String getGood_isfree() {
        return good_isfree;
    }

    public void setGood_isfree(String good_isfree) {
        this.good_isfree = good_isfree;
    }

    public String getGood_ischange() {
        return good_ischange;
    }

    public void setGood_ischange(String good_ischange) {
        this.good_ischange = good_ischange;
    }
}
