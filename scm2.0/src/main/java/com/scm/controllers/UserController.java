package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//user dashboard page
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/dashboard")
    public String userDashboard() {
        return "user/dashboard";
    }

    //user profile page
    @RequestMapping(value = "/profile")
    public String userProfile() {
        return "user/profile";
    }

    //user add coontacts page
    //user view contacts 
    //use edit contact
    //user delete contact
    //user search contact
}
