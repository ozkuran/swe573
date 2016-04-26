package com.ozkuran.bukoop.controller;

import com.ozkuran.bukoop.service.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by maozkuran on 23/04/16.
 */

@Controller
@RequestMapping("/product")
public class ProductController {

        @Autowired
        ProductManager manager;

        @RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
        public String getAllEmployees(Model model)
        {
            model.addAttribute("products", manager.getAllProducts());
            return "displayProductsList";
        }
}
