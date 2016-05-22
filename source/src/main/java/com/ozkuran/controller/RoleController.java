package com.ozkuran.controller;

import com.ozkuran.model.Role;
import com.ozkuran.services.RoleService;
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
public class RoleController {
    private RoleService roleService;

    @Autowired
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public String list(Model model){
        Iterable<Role> ptlist = roleService.listAllRoles();
        model.addAttribute("roles", ptlist);
        return "roles";
    }

    @RequestMapping("role/{id}")
    public String showRole(@PathVariable Integer id, Model model){
        model.addAttribute("role", roleService.getRoleById(id));
        return "role";
    }

    @RequestMapping("role/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("role", roleService.getRoleById(id));
        return "roleform";
    }

    @RequestMapping("role/new")
    public String newRole(Model model){
        model.addAttribute("role", new Role());
        return "roleform";
    }

    @RequestMapping(value = "role", method = RequestMethod.POST)
    public String saveRole(Role role){
        roleService.saveRole(role);
        return "redirect:/role/" + role.getId();
    }

    @RequestMapping("role/delete/{id}")
    public String delete(@PathVariable Integer id){
        roleService.deleteRole(id);
        return "redirect:/roles";
    }

}
