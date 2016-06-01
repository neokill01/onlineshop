package com.onlineshop.controller;

import com.onlineshop.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by neo on 16/6/2.
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    User user = new User();
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public @ResponseBody User register() {
        user.setUsername("郭俊誉");
        user.setPassword("123456");
        return user;
    }
}
