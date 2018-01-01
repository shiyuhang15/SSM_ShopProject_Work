package com.syh.controller;

import com.syh.pojo.User;
import com.syh.service.UserService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/reg")
    public ModelAndView reg(User user){
        ModelAndView mav=new ModelAndView();
        //会员编号vip_id
        StringBuffer sb1=new StringBuffer();
        for(int i=0;i<4;i++){
            char c=(char)(int)(Math.random()*26+95);
            sb1.append(c);
        }
        String str=user.getVip_card().substring(13);
        String vip_id="ht_"+sb1.toString()+str;
        user.setVip_id(vip_id);
        //加密
        StringBuffer sb2=new StringBuffer();
        for (int i=0;i<6;i++){
            char c=(char)(int)(Math.random()*26+97);
            sb2.append(c);
        }
        String salt=sb2.toString();
        user.setSalt(salt);
        SimpleHash sh=new SimpleHash("MD5",user.getPassword(),salt,3);
        String password=sh.toString();
        user.setPassword(password);
        Date date=new Date();
        user.setVip_regdate(date);
        userService.saveUser(user);
        mav.getModel().put("username",user.getUsername());
        mav.setViewName("/login.jsp");
        return mav;
    }
    @RequestMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response)throws Exception{

        System.out.println("--controller_login--");
        request.getRequestDispatcher("/login.jsp").forward(request,response);

    }
    @RequestMapping("/selUserByname")
    public @ResponseBody int selUserByname(String username){
        System.out.println("--controller_username--"+username);
        int res=userService.selUserByname(username);
        System.out.println(res);
        return res;
    }
}
