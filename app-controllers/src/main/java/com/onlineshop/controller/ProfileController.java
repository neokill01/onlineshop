package com.onlineshop.controller;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/profile")
public class ProfileController {
    private Logger logger = Logger.getLogger(ProfileController.class);
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String actionIndex() {
        logger.info("profile/index");
        return "profile/index";
    }
}
