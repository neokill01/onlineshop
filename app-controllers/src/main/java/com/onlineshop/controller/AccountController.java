package com.onlineshop.controller;

import com.onlineshop.model.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


/**
 * Created by neo on 16/6/2.
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    private Logger logger = Logger.getLogger(ProfileController.class);
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public @ResponseBody User register() {
        User user = new User();
        user.setUsername("郭俊誉");
        user.setPassword("123456");
        user.setCreateTime(Integer.parseInt(String.valueOf(new Date())));
        user.setUpdateTime(Integer.parseInt(String.valueOf(new Date())));
        user.setEmail("gjy010988@163.com");
        user.setId(1);
        user.setNickname("Neo");
        user.setPhone("18710025259");
        user.setStatus(1);
        user.setHeadImg("http://www.baidu.com");
        logger.info(user.toString());
        return user;
    }
}
