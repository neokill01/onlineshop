package com.onlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by neo on 16/5/31.
 */

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String actionIndex() {
        return "admin/index";
    }
}
