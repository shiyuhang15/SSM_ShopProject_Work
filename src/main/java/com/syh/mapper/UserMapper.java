package com.syh.mapper;

import com.syh.pojo.User;

public interface UserMapper {
    public void saveUser(User user);
    public User selUserByUsercode(String usercode);
    public int selUserByname(String username);
}
