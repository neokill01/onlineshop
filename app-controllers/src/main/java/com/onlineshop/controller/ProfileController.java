package com.onlineshop.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.helpers.Loader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by neo on 16/5/27.
 */
@Controller
@RequestMapping("/profile")
public class ProfileController {
    private Logger logger = Logger.getLogger(ProfileController.class);
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String actionIndex() {
        logger.info("进入个人首页");
        return "profile/index";
    }
}
