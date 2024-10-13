package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    //sending data to view
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler");
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("YoutubeChannel","Learn Code with Durgesh");
        model.addAttribute("githubRepo","https://github.com/rajalsrivastava");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isLogin",false);
        System.out.println("About page loading");
        return "about";
    }

    //services

    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("services page loading");
        return "services";
    }

    //contact page

    @GetMapping("/contact")
    public String contact(){
        
        return "contact";
    }

    @GetMapping("/login")
    public String login(){
        
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        
        return "register";
    }

}
