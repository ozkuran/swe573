package com.ozkuran.controller;

import com.ozkuran.model.ProductType;
import com.ozkuran.services.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MahmutAli on 5/19/2016.
 */
public class ProductTypeController {
    private ProductTypeService producttypeService;

    @Autowired
    public void setProductTypeService(ProductTypeService producttypeService) {
        this.producttypeService = producttypeService;
    }

    @RequestMapping(value = "/producttypes", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("producttypes", producttypeService.listAllProductType());
        return "producttypes";
    }

    @RequestMapping("producttype/{id}")
    public String showProductType(@PathVariable Integer id, Model model){
        model.addAttribute("producttype", producttypeService.getProductTypeById(id));
        return "producttype";
    }

    @RequestMapping("producttype/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("producttype", producttypeService.getProductTypeById(id));
        return "producttypeform";
    }

    @RequestMapping("producttype/new")
    public String newProductType(Model model){
        model.addAttribute("producttype", new ProductType());
        return "producttypeform";
    }

    @RequestMapping(value = "producttype", method = RequestMethod.POST)
    public String saveProductType(ProductType producttype){
        producttypeService.saveProductType(producttype);
        return "redirect:/producttype/" + producttype.getId();
    }

    @RequestMapping("producttype/delete/{id}")
    public String delete(@PathVariable Integer id){
        producttypeService.deleteProductType(id);
        return "redirect:/producttypes";
    }
}

