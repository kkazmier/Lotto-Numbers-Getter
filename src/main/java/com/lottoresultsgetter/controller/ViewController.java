package com.lottoresultsgetter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping({"/", "/home"})
    public String home(Model model) {
        return "home";
    }


}
