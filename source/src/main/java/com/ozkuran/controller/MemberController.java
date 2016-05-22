package com.ozkuran.controller;

import com.ozkuran.model.Member;
import com.ozkuran.services.MemberService;
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
public class MemberController {
    private MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping(value = "/members", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("members", memberService.listAllMembers());
        return "members";
    }

    @RequestMapping("member/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("member", memberService.getMemberById(id));
        return "member";
    }

    @RequestMapping("member/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("member", memberService.getMemberById(id));
        return "memberform";
    }

    @RequestMapping("member/new")
    public String newMember(Model model){
        model.addAttribute("member", new Member());
        return "memberform";
    }

    @RequestMapping(value = "member", method = RequestMethod.POST)
    public String saveMember(Member member){
        memberService.saveMember(member);
        return "redirect:/member/" + member.getId();
    }

    @RequestMapping("member/delete/{id}")
    public String delete(@PathVariable Integer id){
        memberService.deleteMember(id);
        return "redirect:/members";
    }
}
