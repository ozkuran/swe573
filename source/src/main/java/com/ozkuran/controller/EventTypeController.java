package com.ozkuran.controller;

import com.ozkuran.model.EventType;
import com.ozkuran.services.EventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MahmutAli on 5/22/2016.
 */

@Controller
public class EventTypeController {
    private EventTypeService eventtypeService;

    @Autowired
    public void setEventTypeService(EventTypeService eventtypeService) {
        this.eventtypeService = eventtypeService;
    }

    @RequestMapping(value = "/eventtypes", method = RequestMethod.GET)
    public String list(Model model){
        Iterable<EventType> ptlist = eventtypeService.listAllEventTypes();
        model.addAttribute("eventtypelist", ptlist);
        return "eventtypes";
    }

    @RequestMapping("eventtype/{id}")
    public String showEventType(@PathVariable Integer id, Model model){
        model.addAttribute("eventtype", eventtypeService.getEventTypeById(id));
        return "eventtype";
    }

    @RequestMapping("eventtype/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("eventtype", eventtypeService.getEventTypeById(id));
        return "eventtypeform";
    }

    @RequestMapping("eventtype/new")
    public String newEventType(Model model){
        model.addAttribute("eventtype", new EventType());
        return "eventtypeform";
    }

    @RequestMapping(value = "eventtype", method = RequestMethod.POST)
    public String saveEventType(EventType eventtype){
        eventtypeService.saveEventType(eventtype);
        return "redirect:/eventtype/" + eventtype.getId();
    }

    @RequestMapping("eventtype/delete/{id}")
    public String delete(@PathVariable Integer id){
        eventtypeService.deleteEventType(id);
        return "redirect:/eventtypes";
    }
}

