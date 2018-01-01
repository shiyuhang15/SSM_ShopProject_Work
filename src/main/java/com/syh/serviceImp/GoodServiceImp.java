package com.syh.serviceImp;

import com.syh.mapper.GoodMapper;
import com.syh.pojo.Good;
import com.syh.service.GoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("goodService")
public class GoodServiceImp implements GoodService {
    @Resource
    private GoodMapper goodMapper;
    public void addGood(Good good) {
        goodMapper.addGood(good);
    }

    public List<Good> selAllGood() {
        List<Good> listGood=goodMapper.selAllGood();
        return listGood;
    }

    public void delGood(int id) {
        goodMapper.delGood(id);
    }

    public List<Good> selGoodByType(String good_type) {
        List<Good> listGood=goodMapper.selGoodByType(good_type);
        return listGood;
    }

    public Good selGoodByGoodId(String good_id) {
        Good good=goodMapper.selGoodByGoodId(good_id);
        return good;
    }
}
