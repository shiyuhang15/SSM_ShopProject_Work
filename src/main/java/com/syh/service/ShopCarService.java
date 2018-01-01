package com.syh.service;

import com.syh.pojo.ShopCar;

import java.util.List;

public interface ShopCarService {
    public void addShopCar(ShopCar shopCar);
    public List<ShopCar> selShopCar();
}
