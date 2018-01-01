package com.syh.pojo;

import java.io.Serializable;

public class GoodInfo implements Serializable {
    private int id;
    private String good_id;
    private String good_info;
    private String goodinfo_imageurl;
    private float good_price;
    private int good_count;

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

    public String getGood_info() {
        return good_info;
    }

    public void setGood_info(String good_info) {
        this.good_info = good_info;
    }

    public String getGoodinfo_imageurl() {
        return goodinfo_imageurl;
    }

    public void setGoodinfo_imageurl(String goodinfo_imageurl) {
        this.goodinfo_imageurl = goodinfo_imageurl;
    }

    public float getGood_price() {
        return good_price;
    }

    public void setGood_price(float good_price) {
        this.good_price = good_price;
    }

    public int getGood_count() {
        return good_count;
    }

    public void setGood_count(int good_count) {
        this.good_count = good_count;
    }

    @Override
    public String toString() {
        return "GoodInfo{" +
                "id=" + id +
                ", good_id='" + good_id + '\'' +
                ", good_info='" + good_info + '\'' +
                ", goodinfo_imageurl='" + goodinfo_imageurl + '\'' +
                ", good_price=" + good_price +
                ", good_count=" + good_count +
                '}';
    }
}
