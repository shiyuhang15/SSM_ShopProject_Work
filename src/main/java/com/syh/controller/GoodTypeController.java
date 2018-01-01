package com.syh.controller;

import com.syh.pojo.Buss;
import com.syh.pojo.GoodType;
import com.syh.service.GoodTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GoodTypeController {
    @Resource
    private GoodTypeService goodTypeService;
    @RequestMapping("/selAllType")
    public ModelAndView selAllType(){
        ModelAndView mav=new ModelAndView();
        List<GoodType> listType=goodTypeService.selAllType();
        List<Buss> listBuss=goodTypeService.selAllBuss();
        mav.getModel().put("listType",listType);
        mav.getModel().put("listBuss",listBuss);
        mav.setViewName("/addGood.jsp");
        return mav;
    }
    @RequestMapping("/selGoodType")
    public ModelAndView selGoodType(){
        ModelAndView mav=new ModelAndView();
        List<GoodType> listType=goodTypeService.selAllType();
        mav.getModel().put("listType",listType);
        mav.setViewName("/htshop.jsp");
        return mav;
    }
}
