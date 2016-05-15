package com.ozkuran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by MahmutAli on 5/15/2016.
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String hello(@RequestParam(defaultValue = "world") String name,Model model){
        model.addAttribute("message", "Hello, " + name);
        return "resultPage";
    }
}
