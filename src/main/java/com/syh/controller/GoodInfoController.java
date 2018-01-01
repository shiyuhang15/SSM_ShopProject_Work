package com.syh.controller;

import com.syh.pojo.Good;
import com.syh.pojo.GoodInfo;
import com.syh.service.GoodInfoService;
import com.syh.service.GoodService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
public class GoodInfoController {
    @Resource
    private GoodInfoService goodInfoService;
    @Resource
    private GoodService goodService;
    @RequestMapping("/selGoodInfoByGoodid")
    public ModelAndView selGoodInfoByGoodid(String good_id){
        ModelAndView mav=new ModelAndView();
        List<GoodInfo> listGoodInfo=goodInfoService.selGoodInfoByGoodid(good_id);
        Good good=goodService.selGoodByGoodId(good_id);
        mav.getModel().put("listGoodInfo",listGoodInfo);
        mav.getModel().put("good",good);
        mav.setViewName("/WEB-INF/jsp/showGoodInfo.jsp");
        return mav;
    }
    @RequestMapping("/takeGoodId")
    public ModelAndView takeGoodId(String good_id){
        ModelAndView mav=new ModelAndView();
        mav.getModel().put("good_id",good_id);
        mav.setViewName("/addGoodInfo.jsp");
        return mav;
    }
    @RequestMapping("/addGoodInfo")
    public ModelAndView addGoodInfo(HttpServletRequest request, String good_id, String good_info, float good_price, int good_count, MultipartFile imageFile)throws Exception{
        ModelAndView mav=new ModelAndView();
        //上传
        String newname=null;
        String path=null;
        if(imageFile.getSize()>0){
            //获得上传文件名
            String oldname=imageFile.getOriginalFilename();
            //创建新文件名
            newname= UUID.randomUUID()+oldname.substring(oldname.lastIndexOf("."));
            //上传路径
            path=request.getSession().getServletContext().getRealPath("/");
            path=path+"/image/"+newname;
            File file=new File(path);
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            imageFile.transferTo(file);
        }
        String imageUrl=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/image/"+newname;
        GoodInfo goodInfo=new GoodInfo();
        goodInfo.setGood_id(good_id);
        goodInfo.setGood_info(good_info);
        goodInfo.setGood_price(good_price);
        goodInfo.setGood_count(good_count);
        goodInfo.setGoodinfo_imageurl(imageUrl);
        mav.getModel().put("rows",1);
        mav.setViewName("/manage");
        return mav;
    }
}
