package com.ozkuran.controller;

import com.ozkuran.model.Producer;
import com.ozkuran.services.ProducerService;
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
public class ProducerController {
    private ProducerService producerService;

    @Autowired
    public void setProducerService(ProducerService producerService) {
        this.producerService = producerService;
    }

    @RequestMapping(value = "/producers", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("products", producerService.listAllProducers());
        return "producers";
    }

    @RequestMapping("producer/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("product", producerService.getProducerById(id));
        return "producer";
    }

    @RequestMapping("producer/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("producer", producerService.getProducerById(id));
        return "producerform";
    }

    @RequestMapping("producer/new")
    public String newProducer(Model model){
        model.addAttribute("producer", new Producer());
        return "producerform";
    }

    @RequestMapping(value = "producer", method = RequestMethod.POST)
    public String saveProducer(Producer producer){
        producerService.saveProducer(producer);
        return "redirect:/producer/" + producer.getId();
    }

    @RequestMapping("producer/delete/{id}")
    public String delete(@PathVariable Integer id){
        producerService.deleteProducer(id);
        return "redirect:/producers";
    }
}
