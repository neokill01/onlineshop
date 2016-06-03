package com.onlineshop.controller;

import com.onlineshop.model.User;
import com.onlineshop.service.AccountService;
import com.onlineshop.service.impl.AccountServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by neo on 16/6/2.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    private Logger logger = Logger.getLogger(AccountController.class);
    @Autowired
    private AccountService userService = new AccountServiceImpl();
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public
    @ResponseBody
    Map<String, Object> register(@RequestParam(value = "username", required = false) String username,
                                 @RequestParam(value = "password", required = false) String password,
                                 @RequestParam(value = "email", required = false) String email) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setCreateTime(Long.parseLong(String.valueOf(new Date().getTime())));
        user.setUpdateTime(Long.parseLong(String.valueOf(new Date().getTime())));
        user.setEmail(email);
        user.setNickname("Neo");
        user.setPhone("18710025259");
        user.setStatus(1);
        userService.register(user);
        Map<String, User> data = new HashMap<>();
        data.put("user", user);
        Map jsonObj = new HashMap<>();
        jsonObj.put("code", 0);
        jsonObj.put("msg", "注册成功");
        jsonObj.put("data", data);
        return jsonObj;
    }
}
