package com.ozkuran.controller;

import com.ozkuran.model.PackageType;
import com.ozkuran.services.PackageTypeService;
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
public class PackageTypeController {
    private PackageTypeService packagetypeService;

    @Autowired
    public void setPackageTypeService(PackageTypeService packagetypeService) {
        this.packagetypeService = packagetypeService;
    }

    @RequestMapping(value = "/packagetypes", method = RequestMethod.GET)
    public String list(Model model){
        Iterable<PackageType> ptlist = packagetypeService.listAllPackageTypes();
        model.addAttribute("packagetypelist", ptlist);
        return "packagetypes";
    }

    @RequestMapping("packagetype/{id}")
    public String showPackageType(@PathVariable Integer id, Model model){
        model.addAttribute("packagetype", packagetypeService.getPackageTypeById(id));
        return "packagetype";
    }

    @RequestMapping("packagetype/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("packagetype", packagetypeService.getPackageTypeById(id));
        return "packagetypeform";
    }

    @RequestMapping("packagetype/new")
    public String newPackageType(Model model){
        model.addAttribute("packagetype", new PackageType());
        return "packagetypeform";
    }

    @RequestMapping(value = "packagetype", method = RequestMethod.POST)
    public String savePackageType(PackageType packagetype){
        packagetypeService.savePackageType(packagetype);
        return "redirect:/packagetype/" + packagetype.getId();
    }

    @RequestMapping("packagetype/delete/{id}")
    public String delete(@PathVariable Integer id){
        packagetypeService.deletePackageType(id);
        return "redirect:/packagetypes";
    }
}
