package com.ozkuran.controller;

import com.ozkuran.model.Transaction;
import com.ozkuran.services.TransactionService;
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
public class TransactionController {
    private TransactionService transactionService;

    @Autowired
    public void setTransactionService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @RequestMapping(value = "/transactions", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("transactions", transactionService.listAllTransactions());
        return "transactions";
    }

    @RequestMapping("transaction/{id}")
    public String showTransaction(@PathVariable Integer id, Model model){
        model.addAttribute("transaction", transactionService.getTransactionById(id));
        return "transaction";
    }

    @RequestMapping("transaction/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("transaction", transactionService.getTransactionById(id));
        return "transactionform";
    }

    @RequestMapping("transaction/new")
    public String newTransaction(Model model){
        model.addAttribute("transaction", new Transaction());
        return "transactionform";
    }

    @RequestMapping(value = "transaction", method = RequestMethod.POST)
    public String saveTransaction(Transaction transaction){
        transactionService.saveTransaction(transaction);
        return "redirect:/transaction/" + transaction.getId();
    }

    @RequestMapping("transaction/delete/{id}")
    public String delete(@PathVariable Integer id){
        transactionService.deleteTransaction(id);
        return "redirect:/transactions";
    }

}
