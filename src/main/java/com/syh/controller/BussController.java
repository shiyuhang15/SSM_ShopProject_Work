package com.syh.controller;

import com.syh.pojo.Buss;
import com.syh.service.BussService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class BussController {
    @Resource
    private BussService bussService;
    @RequestMapping("/addBuss")
    public ModelAndView addBuss(Buss buss){
        ModelAndView mav=new ModelAndView();
        int rows=bussService.selBussByName(buss.getBuss_name());
        if(rows==0){
            bussService.addBuss(buss);
        }
        mav.getModel().put("res",1);
        mav.setViewName("/good.jsp");
        return mav;
    }
}
