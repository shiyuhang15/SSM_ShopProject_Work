package com.syh.pojo;

import java.io.Serializable;

public class GoodType implements Serializable {
    private int id;
    private String good_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGood_type() {
        return good_type;
    }

    public void setGood_type(String good_type) {
        this.good_type = good_type;
    }

    @Override
    public String toString() {
        return "GoodType{" +
                "id=" + id +
                ", good_type='" + good_type + '\'' +
                '}';
    }
}
