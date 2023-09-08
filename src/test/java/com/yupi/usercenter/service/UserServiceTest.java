package com.yupi.usercenter.service;
import java.util.Date;

import com.yupi.usercenter.model.domain.User;
import com.yupi.usercenter.model.domain.request.UserUpdateRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户服务测试
 * @author philip
 */
@SpringBootTest
class UserServiceTest {
    @Resource
    private UserService userService;
    @Test
    void testAddUser(){
        User user = new User();
        user.setUsername("test123");
        user.setUserAccount("123");
        user.setAvatarUrl("");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("456");
        boolean result = userService.save(user);
        System.out.println(user.getId());

        Assertions.assertTrue(result);

    }

    @Test
    void userRegister() {
        String userAccount = "test";
        String userPassword = "";
        String checkPassword = "123456789";
        long result = userService.userRegister(userAccount,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);

        userAccount = "no";
        result = userService.userRegister(userAccount,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);

        userAccount = "tes t123";
        result = userService.userRegister(userAccount,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);

        userAccount = "test123";
        result = userService.userRegister(userAccount,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);

        userPassword = "123456";
        result = userService.userRegister(userAccount,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);

        userAccount = "test";
        userPassword = "12345678";
        result = userService.userRegister(userAccount,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);

        checkPassword = "12345678";
        result = userService.userRegister(userAccount,userPassword,checkPassword);
        Assertions.assertTrue(result>0);




    }

    @Test
    void userUpdate() {
        long id = 1;
        String userAccount;
        String username;
        int gender = 1;
        String phone = "";
        String email = "asd@gmail.com";
        int userRole = 1;
        String avatarUrl = "";

        userAccount = "update123";
        username = "updated";
        UserUpdateRequest test = new UserUpdateRequest(id,userAccount,username,avatarUrl,gender,phone,email,userRole);
        long result = userService.userUpdate(test);
        Assertions.assertEquals(1,result);
    }
}
