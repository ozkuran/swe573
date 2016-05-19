package com.ozkuran.controller;

import com.ozkuran.model.Announcement;
import com.ozkuran.services.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MahmutAli on 5/15/2016.
 */

@Controller
@EnableAutoConfiguration
public class MainController {
    private AnnouncementService announcementService;

    @Autowired
    public void setAnnouncementService(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){
        Page<Announcement> page = announcementService.getLatestAnnouncements();
        model.addAttribute("latestannouncements", page.getContent());
        return "index2";
    }
}
