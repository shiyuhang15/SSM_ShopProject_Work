package com.syh.controller;

import com.syh.pojo.ShopCar;
import com.syh.pojo.User;
import com.syh.service.GoodInfoService;
import com.syh.service.GoodService;
import com.syh.service.ShopCarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ShopCarController {
    @Resource
    private ShopCarService shopCarService;
    @RequestMapping("/addShopCar")
    public ModelAndView addShopCar(HttpServletRequest request, ShopCar shopCar,String good_id){
        ModelAndView mav=new ModelAndView();
        User user=(User) request.getSession().getAttribute("user");
        shopCar.setVip_id(user.getId());
        shopCarService.addShopCar(shopCar);
        mav.getModel().put("rows",1);
        mav.getModel().put("good_id",good_id);
        mav.setViewName("/selGoodInfoByGoodid");
        return mav;
    }
    @RequestMapping("/selShopCar")
    public ModelAndView selShopCar(){
        ModelAndView mav=new ModelAndView();
        //查询所有
        List<ShopCar> listShopCar=shopCarService.selShopCar();
        mav.getModel().put("listShopCar",listShopCar);
        mav.setViewName("/WEB-INF/jsp/shopCar.jsp");
        return mav;
    }
}
