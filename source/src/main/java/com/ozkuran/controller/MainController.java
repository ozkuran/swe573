package com.ozkuran.controller;

import com.ozkuran.model.Announcement;
import com.ozkuran.model.Product;
import com.ozkuran.services.*;
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

    private BulletinService bulletinService;

    @Autowired
    public void setBulletinService(BulletinService bulletinService) {
        this.bulletinService = bulletinService;
    }

    private EventService eventService;

    @Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    private EventTypeService eventtypeService;

    @Autowired
    public void setEventTypeService(EventTypeService eventtypeService) {
        this.eventtypeService = eventtypeService;
    }

    private MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    private PackageTypeService packagetypeService;

    @Autowired
    public void setPackageTypeService(PackageTypeService packagetypeService) {
        this.packagetypeService = packagetypeService;
    }

    private ProducerService producerService;

    @Autowired
    public void setProducerService(ProducerService producerService) {
        this.producerService = producerService;
    }

    private ProductTypeService producttypeService;

    @Autowired
    public void setProductTypeService(ProductTypeService producttypeService) {
        this.producttypeService = producttypeService;
    }

    private RoleService roleService;

    @Autowired
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping(value = {"/","index"}, method = RequestMethod.GET)
    public String index(Model model){
        Page<Announcement> page = announcementService.getLatestAnnouncements();
        model.addAttribute("latestannouncements", page.getContent());
        Page<Product> page2 = productService.getLatestProducts();
        model.addAttribute("latestproducts", page2.getContent());
        return "index2";
    }

    @RequestMapping(value = {"admin"}, method = RequestMethod.GET)
    public String admin(Model model){
        model.addAttribute("announcements", announcementService.listAllAnnouncements());
        model.addAttribute("bulletins", bulletinService.listAllBulletins());
        model.addAttribute("events", eventService.listAllEvents());
        model.addAttribute("members", memberService.listAllMembers());
        model.addAttribute("packagetypes", packagetypeService.listAllPackageTypes());
        model.addAttribute("producers", producerService.listAllProducers());
        model.addAttribute("products", productService.listAllProducts());
        model.addAttribute("producttypes", producttypeService.listAllProductType());
        model.addAttribute("roles", roleService.listAllRoles());
        return "admin";
    }

}
