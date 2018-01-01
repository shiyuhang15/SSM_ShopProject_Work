package com.syh.serviceImp;

import com.syh.mapper.BussMapper;
import com.syh.pojo.Buss;
import com.syh.service.BussService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("bussService")
public class BussServiceImp implements BussService {
    @Resource
    private BussMapper bussMapper;
    public int selBussByName(String buss_name) {
        int rows=bussMapper.selBussByName(buss_name);
        return rows;
    }

    public void addBuss(Buss buss) {
        bussMapper.addBuss(buss);
    }
}
