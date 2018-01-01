package com.syh.mapper;

import com.syh.pojo.Good;

import java.util.List;

public interface GoodMapper {
    public void addGood(Good good);
    public List<Good> selAllGood();
    public void delGood(int id);
    public List<Good> selGoodByType(String good_type);
    public Good selGoodByGoodId(String good_id);
}
