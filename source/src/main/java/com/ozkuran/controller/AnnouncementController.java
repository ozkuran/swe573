package com.ozkuran.controller;

import com.ozkuran.model.Announcement;
import com.ozkuran.services.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MahmutAli on 5/19/2016.
 */

@Controller
public class AnnouncementController {
    private AnnouncementService announcementService;

    @Autowired
    public void setAnnouncementService(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @RequestMapping(value = "/announcements", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("announcements", announcementService.listAllAnnouncements());
        return "announcements";
    }

    @RequestMapping(value = "/latestannouncements", method = RequestMethod.GET)
    public String getLatestAnnouncements(Model model){
        Page<Announcement> page = announcementService.getLatestAnnouncements();
        model.addAttribute("latestannouncements", page.getContent());
        return "latestannouncements";
    }

    @RequestMapping("announcement/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("announcement", announcementService.getAnnouncementById(id));
        return "announcement";
    }

    @RequestMapping("announcement/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("announcement", announcementService.getAnnouncementById(id));
        return "announcementform";
    }

    @RequestMapping("announcement/new")
    public String newAnnouncement(Model model){
        model.addAttribute("announcement", new Announcement());
        return "announcementform";
    }

    @RequestMapping(value = "announcement", method = RequestMethod.POST)
    public String saveAnnouncement(Announcement announcement){
        announcementService.saveAnnouncement(announcement);
        return "redirect:/announcement/" + announcement.getId();
    }

    @RequestMapping("announcement/delete/{id}")
    public String delete(@PathVariable Integer id) {
        announcementService.deleteAnnouncement(id);
        return "redirect:/announcements";
    }
}
