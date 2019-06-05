package com.spring.mvc.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = {"/","/welcome", "/index"})
    ModelAndView homePage(){
        ModelAndView md = new ModelAndView("HomePage");
        md.addObject("message","Welcome to Home!!");
        return md;
    }
}
