package com.scm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scm.entities.User;
import com.scm.forms.UserForm;
import com.scm.services.UserService;


@Controller
public class PageController {

    @Autowired
    private UserService userService;

    //sending data to view
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler");
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("YoutubeChannel", "Learn Code with Durgesh");
        model.addAttribute("githubRepo", "https://github.com/rajalsrivastava");
        return "home";
    }
    
    //about  route

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
        
        return new String("contact");
    }

    @GetMapping("/login")
    public String login(){
        
        return new String("login");
    }

    @GetMapping("/register")
    public String register(Model model) {

        UserForm userForm = new UserForm();
        //default data bhi daal sakte hain
        //userForm.setName("rajal");
        model.addAttribute("userForm", userForm);

        return "register";
    }
    
    //processing register

    @RequestMapping(value="/do-register", method = RequestMethod.POST)
    public String processRegister(@ModelAttribute UserForm userForm) {
        System.out.println("Processing registration");
        //fetch form data
        //UserForm
        System.out.println(userForm);
        //validate form data
        //todo:Validate userForm[next video]

        //save to database



        //userservice

        //UserForm-->User

        User user = User.builder()
                .name(userForm.getName())
                .email(userForm.getEmail())
                .password(userForm.getPassword())
                .about(userForm.getAbout())
                .phoneNumber(userForm.getPhoneNumber())
                .profilePic("scm2.0\\src\\main\\resources\\static\\images\\defaultprofilepic.jpg")
        .build();

        User savedUser = userService.saveUser(user);

        System.out.println("User saved");
        //message = "Registration Successful"

        //redirect to login page
        return "redirect:/register";
       
    } 
    
    
}
