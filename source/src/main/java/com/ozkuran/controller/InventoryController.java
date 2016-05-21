package com.ozkuran.controller;

import com.ozkuran.model.Inventory;
import com.ozkuran.services.InventoryService;
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
public class InventoryController {
    private InventoryService inventoryService;

    @Autowired
    public void setInventoryService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @RequestMapping(value = "/inventoryitems", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("inventoryitems", inventoryService.listAllInventoryItems());
        return "inventoryitems";
    }

    @RequestMapping("inventory/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("inventory", inventoryService.getInventoryItemById(id));
        return "inventory";
    }

    @RequestMapping("inventory/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("inventory", inventoryService.getInventoryItemById(id));
        return "inventoryform";
    }

    @RequestMapping("inventory/new")
    public String newInventory(Model model){
        model.addAttribute("inventory", new Inventory());
        return "inventoryform";
    }

    @RequestMapping(value = "inventory", method = RequestMethod.POST)
    public String saveInventory(Inventory inventory){
        inventoryService.saveInventoryItem(inventory);
        return "redirect:/inventory/" + inventory.getId();
    }

    @RequestMapping("inventory/delete/{id}")
    public String delete(@PathVariable Integer id) {
        inventoryService.deleteInventoryItem(id);
        return "redirect:/inventorys";
    }

}
