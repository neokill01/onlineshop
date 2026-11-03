package com.onlineshop.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/profile")
public class ProfileController {
    private static final Logger logger = LogManager.getLogger(ProfileController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String actionIndex() {
        logger.info("profile/index");
        return "profile/index";
    }
}
