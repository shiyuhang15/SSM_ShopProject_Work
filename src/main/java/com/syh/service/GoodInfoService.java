package com.syh.service;

import com.syh.pojo.GoodInfo;

import java.util.List;

public interface GoodInfoService {
    public List<GoodInfo> selGoodInfoByGoodid(String good_id);
    public void addGoodInfo(GoodInfo goodInfo);
}
