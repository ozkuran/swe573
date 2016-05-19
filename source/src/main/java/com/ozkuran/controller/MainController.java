package com.ozkuran.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MahmutAli on 5/15/2016.
 */

@Controller
@EnableAutoConfiguration
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index2";
    }
}
