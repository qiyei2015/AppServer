package com.qiyei.controller;

import com.qiyei.pojo.User;
import com.qiyei.service.UserService;
import com.qiyei.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qiyei2015 on 2016/12/30.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/signup",method = RequestMethod.GET)
    String signup(String name,String password){
        User user = new User();
        user.setUserName(name);
        user.setUserPassword(password);

        userService.save(user);
        return Result.create(1000,"注册成功",user);

    }

}
