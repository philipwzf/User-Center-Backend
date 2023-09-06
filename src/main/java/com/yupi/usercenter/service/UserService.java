package com.yupi.usercenter.service;

import com.yupi.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author philip
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-08-21 17:15:23
*/
public interface UserService extends IService<User> {


    /**
     * 用户注释
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 二次密码
     * @return 新用户ID
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    User getSafetyUser(User user);

    /**
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
