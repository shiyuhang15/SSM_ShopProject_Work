package com.syh.pojo;

import java.io.Serializable;

public class ShopCar implements Serializable {
    private int id;
    private int vip_id;
    private String good_info;
    private String good_name;
    private int info_count;
    private float good_price;

    @Override
    public String toString() {
        return "ShopCar{" +
                "id=" + id +
                ", vip_id=" + vip_id +
                ", good_info='" + good_info + '\'' +
                ", good_name='" + good_name + '\'' +
                ", info_count=" + info_count +
                ", good_price=" + good_price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVip_id() {
        return vip_id;
    }

    public void setVip_id(int vip_id) {
        this.vip_id = vip_id;
    }

    public String getGood_info() {
        return good_info;
    }

    public void setGood_info(String good_info) {
        this.good_info = good_info;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    public int getInfo_count() {
        return info_count;
    }

    public void setInfo_count(int info_count) {
        this.info_count = info_count;
    }

    public float getGood_price() {
        return good_price;
    }

    public void setGood_price(float good_price) {
        this.good_price = good_price;
    }
}
