package com.xx.edu.service;

import com.xx.edu.model.User;
import com.xx.edu.service.base.IBaseService;


public interface IUserService extends IBaseService<User> {

    //特有的方法
    public User login(String username, String password);
}
