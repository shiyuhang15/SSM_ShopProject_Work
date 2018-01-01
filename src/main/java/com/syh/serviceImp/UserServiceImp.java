package com.syh.serviceImp;

import com.syh.mapper.UserMapper;
import com.syh.pojo.User;
import com.syh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImp implements UserService {
    @Resource
    private UserMapper userMapper;
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }
    public User selUserByUsercode(String usercode) {
        return userMapper.selUserByUsercode(usercode);
    }

    public int selUserByname(String username) {
        int res=userMapper.selUserByname(username);
        return res;
    }

}
