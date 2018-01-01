package com.syh.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private int id;
    private String vip_id;
    private String username;
    private String password;
    private String vip_type;
    private String vip_card;
    private String vip_realname;
    private Date vip_regdate;
    private int vip_point;
    private float vip_balance;
    private String vip_email;
    private int vip_addressid;
    private float vip_amount;
    private String vip_phone;
    private String salt;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVip_id() {
        return vip_id;
    }

    public void setVip_id(String vip_id) {
        this.vip_id = vip_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVip_type() {
        return vip_type;
    }

    public void setVip_type(String vip_type) {
        this.vip_type = vip_type;
    }

    public String getVip_card() {
        return vip_card;
    }

    public void setVip_card(String vip_card) {
        this.vip_card = vip_card;
    }

    public String getVip_realname() {
        return vip_realname;
    }

    public void setVip_realname(String vip_realname) {
        this.vip_realname = vip_realname;
    }

    public Date getVip_regdate() {
        return vip_regdate;
    }

    public void setVip_regdate(Date vip_regdate) {
        this.vip_regdate = vip_regdate;
    }

    public int getVip_point() {
        return vip_point;
    }

    public void setVip_point(int vip_point) {
        this.vip_point = vip_point;
    }

    public float getVip_balance() {
        return vip_balance;
    }

    public void setVip_balance(float vip_balance) {
        this.vip_balance = vip_balance;
    }

    public String getVip_email() {
        return vip_email;
    }

    public void setVip_email(String vip_email) {
        this.vip_email = vip_email;
    }

    public int getVip_addressid() {
        return vip_addressid;
    }

    public void setVip_addressid(int vip_addressid) {
        this.vip_addressid = vip_addressid;
    }

    public float getVip_amount() {
        return vip_amount;
    }

    public void setVip_amount(float vip_amount) {
        this.vip_amount = vip_amount;
    }

    public String getVip_phone() {
        return vip_phone;
    }

    public void setVip_phone(String vip_phone) {
        this.vip_phone = vip_phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", vip_id='" + vip_id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", vip_type='" + vip_type + '\'' +
                ", vip_card='" + vip_card + '\'' +
                ", vip_realname='" + vip_realname + '\'' +
                ", vip_regdate=" + vip_regdate +
                ", vip_point=" + vip_point +
                ", vip_balance=" + vip_balance +
                ", vip_email='" + vip_email + '\'' +
                ", vip_addressid=" + vip_addressid +
                ", vip_amount=" + vip_amount +
                ", vip_phone='" + vip_phone + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}
