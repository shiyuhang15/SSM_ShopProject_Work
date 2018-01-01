package com.syh.mapper;

import com.syh.pojo.ShopCar;

import java.util.List;

public interface ShopCarMapper {
    public void addShopCar(ShopCar shopCar);
    public List<ShopCar> selShopCar();
}
