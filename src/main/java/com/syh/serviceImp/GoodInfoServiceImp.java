package com.syh.serviceImp;

import com.syh.mapper.GoodInfoMapper;
import com.syh.pojo.GoodInfo;
import com.syh.service.GoodInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("goodInfoService")
public class GoodInfoServiceImp implements GoodInfoService {
    @Resource
    private GoodInfoMapper goodInfoMapper;
    public List<GoodInfo> selGoodInfoByGoodid(String good_id) {
        List<GoodInfo> list=goodInfoMapper.selGoodInfoByGoodid(good_id);
        return list;
    }

    public void addGoodInfo(GoodInfo goodInfo) {
        goodInfoMapper.addGoodInfo(goodInfo);
    }
}
