package com.ozkuran.controller;

import com.ozkuran.dto.Packaging;
import com.ozkuran.dto.Producer;
import com.ozkuran.dto.Product;
import com.ozkuran.dto.ProductType;
import com.ozkuran.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by MahmutAli on 5/15/2016.
 */


@Controller
public class ProductController {

    @Resource
    private ProductRepository repo;


    @RequestMapping("/product")
    public String hello(@RequestParam(defaultValue = "world") String name, Model model){
        repo.save(new Product("Yeşil Zeytin",new ProductType("Zeytin"),new Packaging("Kavanoz"),new Producer("Mahmut Ağa")));

        model.addAttribute("message", "Hello, from product " + name);
        return "resultPage";
    }

}
