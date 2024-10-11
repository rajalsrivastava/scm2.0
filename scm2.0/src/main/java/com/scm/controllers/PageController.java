package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
}
