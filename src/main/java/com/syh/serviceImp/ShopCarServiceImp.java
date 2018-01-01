package com.syh.serviceImp;

import com.syh.mapper.ShopCarMapper;
import com.syh.pojo.ShopCar;
import com.syh.service.ShopCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("shopCarService")
public class ShopCarServiceImp implements ShopCarService {
    @Resource
    private ShopCarMapper shopCarMapper;
    public void addShopCar(ShopCar shopCar) {
        shopCarMapper.addShopCar(shopCar);
    }

    public List<ShopCar> selShopCar() {
        return shopCarMapper.selShopCar();
    }
}
