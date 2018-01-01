package com.syh.realm;

import com.syh.pojo.User;
import com.syh.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

public class CustomRealm extends AuthorizingRealm {
    @Override
    public void setName(String name) {
        super.setName("customRealm");
    }
    @Resource
    private UserService userService;
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("--realm_认证--");
        //获得用户身份
        String usercode=token.getPrincipal().toString();
        System.out.println("--usercode--"+usercode);
        //根据用户名从数据库查询
        User user=userService.selUserByUsercode(usercode);
        if(user==null){
            return null;
        }else{
            Subject subject= SecurityUtils.getSubject();
            Session session=subject.getSession();
            session.setAttribute("user",user);
            System.out.println("--realm--"+user);
            //返回认证信息
            SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(user,user.getPassword(), ByteSource.Util.bytes(user.getSalt()),this.getName());
            return info;
        }
    }
}
