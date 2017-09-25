package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by zhouwx on 2017/9/25
 * intelliJ IDEA
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
