package com.ozkuran.controller;

import com.ozkuran.model.Bulletin;
import com.ozkuran.services.BulletinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MahmutAli on 5/21/2016.
 */

@Controller
public class BulletinController {
    private BulletinService bulletinService;

    @Autowired
    public void setBulletinService(BulletinService bulletinService) {
        this.bulletinService = bulletinService;
    }

    @RequestMapping(value = "/bulletins", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("bulletins", bulletinService.listAllBulletins());
        return "bulletins";
    }

    @RequestMapping("bulletin/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("bulletin", bulletinService.getBulletinById(id));
        return "bulletin";
    }

    @RequestMapping("bulletin/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("bulletin", bulletinService.getBulletinById(id));
        return "bulletinform";
    }

    @RequestMapping("bulletin/new")
    public String newBulletin(Model model){
        model.addAttribute("bulletin", new Bulletin());
        return "bulletinform";
    }

    @RequestMapping(value = "bulletin", method = RequestMethod.POST)
    public String saveBulletin(Bulletin bulletin){
        bulletinService.saveBulletin(bulletin);
        return "redirect:/bulletin/" + bulletin.getId();
    }

    @RequestMapping("bulletin/delete/{id}")
    public String delete(@PathVariable Integer id) {
        bulletinService.deleteBulletin(id);
        return "redirect:/bulletins";
    }
}
