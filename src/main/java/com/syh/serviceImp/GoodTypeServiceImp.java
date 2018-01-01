package com.syh.serviceImp;

import com.syh.mapper.BussMapper;
import com.syh.mapper.GoodTypeMapper;
import com.syh.pojo.Buss;
import com.syh.pojo.GoodType;
import com.syh.service.GoodTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("goodTypeService")
public class GoodTypeServiceImp implements GoodTypeService {
    @Resource
    private GoodTypeMapper goodTypeMapper;
    @Resource
    private BussMapper bussMapper;
    public List<GoodType> selAllType() {
        List<GoodType> listType=goodTypeMapper.selAllType();
        return listType;
    }

    public List<Buss> selAllBuss() {
        List<Buss> listBuss=bussMapper.selAllBuss();
        return listBuss;
    }
}
