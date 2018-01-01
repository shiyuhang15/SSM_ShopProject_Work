package com.syh.service;

import com.syh.pojo.User;

public interface UserService {
    public void saveUser(User user);
    public User selUserByUsercode(String usercode);
    public int selUserByname(String username);
}
