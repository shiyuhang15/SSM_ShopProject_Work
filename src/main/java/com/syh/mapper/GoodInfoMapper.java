package com.syh.mapper;

import com.syh.pojo.GoodInfo;

import java.util.List;

public interface GoodInfoMapper {
    public List<GoodInfo> selGoodInfoByGoodid(String good_id);
    public void addGoodInfo(GoodInfo goodInfo);
}
