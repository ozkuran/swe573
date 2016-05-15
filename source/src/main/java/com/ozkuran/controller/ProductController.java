package com.ozkuran.controller;

import com.ozkuran.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by MahmutAli on 5/15/2016.
 */


@Controller
public class ProductController {

    @Autowired
    private ProductDAO product;


    @RequestMapping("/product")
    public String hello(@RequestParam(defaultValue = "world") String name, Model model){
        model.addAttribute("message", "Hello, from product " + name);
        return "resultPage";
    }

}
