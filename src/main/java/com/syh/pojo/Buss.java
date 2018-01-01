package com.syh.pojo;

import java.io.Serializable;

public class Buss implements Serializable {
    private int id;
    private String buss_name;
    private String buss_company;
    private String buss_address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuss_name() {
        return buss_name;
    }

    public void setBuss_name(String buss_name) {
        this.buss_name = buss_name;
    }

    public String getBuss_company() {
        return buss_company;
    }

    public void setBuss_company(String buss_company) {
        this.buss_company = buss_company;
    }

    public String getBuss_address() {
        return buss_address;
    }

    public void setBuss_address(String buss_address) {
        this.buss_address = buss_address;
    }

    @Override
    public String toString() {
        return "Buss{" +
                "id=" + id +
                ", buss_name='" + buss_name + '\'' +
                ", buss_company='" + buss_company + '\'' +
                ", buss_address='" + buss_address + '\'' +
                '}';
    }
}
