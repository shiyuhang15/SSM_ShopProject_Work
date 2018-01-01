package com.syh.controller;

import com.syh.pojo.Good;
import com.syh.pojo.GoodType;
import com.syh.service.GoodService;
import com.syh.service.GoodTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class GoodController {
    @Resource
    private GoodService goodService;
    @Resource
    private GoodTypeService goodTypeService;
    @RequestMapping("/addGood")
    public ModelAndView addGood(HttpServletRequest request, String good_name, String good_type, String good_isfree, String good_ischange, String buss_name, MultipartFile good_imageurl)throws Exception{
        ModelAndView mav=new ModelAndView();
        String newname=null;
        String path=null;
        if(good_imageurl.getSize()>0){
            //获得上传的文件名
            String oldname=good_imageurl.getOriginalFilename();
            //创建新文件名
            newname= UUID.randomUUID()+oldname.substring(oldname.lastIndexOf("."));
            //设置上传路径
            path=request.getSession().getServletContext().getRealPath("/");
            path=path+"/image/"+newname;
            File file=new File(path);
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            //上传
            good_imageurl.transferTo(file);
        }
        String imageurl=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/image/"+newname;
        System.out.println("--goodcontroller_imageurl--"+imageurl);
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<6;i++){
            char c=(char)(int)(Math.random()*26+65);
            sb.append(c);
        }
        String good_id=sb.toString();
        Good good=new Good();
        good.setGood_id(good_id);
        good.setBuss_name(buss_name);
        Date date=new Date();
        good.setGood_createtime(date);
        good.setGood_imageurl(imageurl);
        good.setGood_name(good_name);
        good.setGood_type(good_type);
        good.setGood_isfree(good_isfree);
        good.setGood_ischange(good_ischange);
        goodService.addGood(good);
        mav.setViewName("/good.jsp");
        return mav;
    }
    @RequestMapping("/selAllGood")
    public ModelAndView selAllGood(){
        ModelAndView mav=new ModelAndView();
        List<Good> listGood=goodService.selAllGood();
        mav.getModel().put("listGood",listGood);
        mav.setViewName("/selGoodType");
        return mav;
    }
    @RequestMapping("/manage")
    public ModelAndView manage(){
        ModelAndView mav=new ModelAndView();
        List<Good> listGood=goodService.selAllGood();
        mav.getModel().put("listGood",listGood);
        mav.setViewName("/WEB-INF/jsp/manageGood.jsp");
        return mav;
    }
    @RequestMapping("/delGood")
    public ModelAndView delGood(int id){
        System.out.println("--delGood--");
        ModelAndView mav=new ModelAndView();
        goodService.delGood(id);
        mav.setViewName("/manage");
        return mav;
    }
    @RequestMapping("/selGoodByType")
    public ModelAndView selGoodByType(String good_type){
        ModelAndView mav=new ModelAndView();
        List<Good> listGood=goodService.selGoodByType(good_type);
        List<GoodType> listType=goodTypeService.selAllType();
        mav.getModel().put("listGood",listGood);
        mav.getModel().put("listType",listType);
        mav.setViewName("/showGood.jsp");
        return mav;
    }
}
