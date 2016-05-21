package com.ozkuran.controller;

import com.ozkuran.model.TransactionDetail;
import com.ozkuran.services.TransactionDetailService;
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
public class TransactionDetailController {
    private TransactionDetailService transactionDetailService;

    @Autowired
    public void setTransactionDetailService(TransactionDetailService transactionDetailService) {
        this.transactionDetailService = transactionDetailService;
    }

    @RequestMapping(value = "/transactionDetails", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("transactionDetails", transactionDetailService.listAllTransactionDetails());
        return "transactionDetails";
    }

    @RequestMapping("transactionDetail/{id}")
    public String showTransactionDetail(@PathVariable Integer id, Model model){
        model.addAttribute("transactionDetail", transactionDetailService.getTransactionDetailById(id));
        return "transactionDetail";
    }

    @RequestMapping("transactionDetail/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("transactionDetail", transactionDetailService.getTransactionDetailById(id));
        return "transactionDetailform";
    }

    @RequestMapping("transactionDetail/new")
    public String newTransactionDetail(Model model){
        model.addAttribute("transactionDetail", new TransactionDetail());
        return "transactionDetailform";
    }

    @RequestMapping(value = "transactionDetail", method = RequestMethod.POST)
    public String saveTransactionDetail(TransactionDetail transactionDetail){
        transactionDetailService.saveTransactionDetail(transactionDetail);
        return "redirect:/transactionDetail/" + transactionDetail.getId();
    }

    @RequestMapping("transactionDetail/delete/{id}")
    public String delete(@PathVariable Integer id){
        transactionDetailService.deleteTransactionDetail(id);
        return "redirect:/transactionDetails";
    }

}
