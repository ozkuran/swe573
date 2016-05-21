package com.ozkuran.controller;

import com.ozkuran.model.Product;
import com.ozkuran.services.PackageTypeService;
import com.ozkuran.services.ProducerService;
import com.ozkuran.services.ProductService;
import com.ozkuran.services.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MahmutAli on 5/19/2016.
 */
@Controller
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    private ProductTypeService producttypeService;

    @Autowired
    public void setProductTypeService(ProductTypeService producttypeService) {
        this.producttypeService = producttypeService;
    }

    private ProducerService producerService;

    @Autowired
    public void setProducerService(ProducerService producerService) {
        this.producerService = producerService;
    }

    private PackageTypeService packagetypeService;

    @Autowired
    public void setPackageTypeService(PackageTypeService packagetypeService) {
        this.packagetypeService = packagetypeService;
    }


    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("products", productService.listAllProducts());
        return "products";
    }

    @RequestMapping("product/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "product";
    }

    @RequestMapping("product/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        model.addAttribute("productTypes", producttypeService.listAllProductType());
        model.addAttribute("packageTypes", packagetypeService.listAllPackageTypes());
        model.addAttribute("producers", producerService.listAllProducers());
        return "productform";
    }

    @RequestMapping("product/new")
    public String newProduct(Model model){
        model.addAttribute("product", new Product());
        model.addAttribute("productTypes", producttypeService.listAllProductType());
        model.addAttribute("packageTypes", packagetypeService.listAllPackageTypes());
        model.addAttribute("producers", producerService.listAllProducers());
        return "productform";
    }

    @RequestMapping(value = "product", method = RequestMethod.POST)
    public String saveProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/product/" + product.getId();
    }

    @RequestMapping("product/delete/{id}")
    public String delete(@PathVariable Integer id){
        productService.deleteProduct(id);
        return "redirect:/products";
    }
}
