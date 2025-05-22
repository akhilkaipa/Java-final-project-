package com.example.greetingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping(value ="/"
    public string hello(){return "Hello Vistula, in my first Spring controller.";}
    
    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "Guest") String name,
            Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
