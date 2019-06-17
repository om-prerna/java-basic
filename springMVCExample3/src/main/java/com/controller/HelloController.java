package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = {"/home", "/"}, method = RequestMethod.GET)
    public String hello(Model model){
        String message = "Home";
        model.addAttribute("fromMessage", "I am from Rajasthan");
        return message; //its the view name . So will look for prefix+Home+suffix
    }
}
