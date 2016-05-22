package com.ozkuran.controller;

import com.ozkuran.model.Transaction;
import com.ozkuran.model.TransactionDetail;
import com.ozkuran.services.MemberService;
import com.ozkuran.services.ProductService;
import com.ozkuran.services.TransactionDetailService;
import com.ozkuran.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    private TransactionDetailService transactionDetailService;

    @Autowired
    public void setTransactionDetailService(TransactionDetailService transactionDetailService) {
        this.transactionDetailService = transactionDetailService;
    }

    private MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/transactions", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("transactions", transactionService.listAllTransactions());
        return "transactions";
    }

    @RequestMapping("transaction/{id}")
    public String showTransaction(@PathVariable Integer id, Model model){
        model.addAttribute("transactionDetail", transactionService.getTransactionById(id).getTransactionDetails());
        model.addAttribute("transaction", transactionService.getTransactionById(id));
        return "transaction";
    }

    @RequestMapping("transaction/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("transaction", transactionService.getTransactionById(id));
        model.addAttribute("members", memberService.listAllMembers());
        model.addAttribute("products", productService.listAllProducts());
        model.addAttribute("transactionDetail", transactionService.getTransactionById(id).getTransactionDetails());
        return "transactionform";
    }

    @RequestMapping("transaction/new")
    public String newTransaction(Model model){
        model.addAttribute("transaction", new Transaction());
        model.addAttribute("members", memberService.listAllMembers());
        model.addAttribute("products", productService.listAllProducts());
        model.addAttribute("transactionDetail", new TransactionDetail());
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

    @RequestMapping(value="/transaction/{id}/transactiondetails", method=RequestMethod.POST)
    public String addTransactionDetails(@PathVariable Integer id, @RequestParam Integer transactionDetailId, Model model) {
        TransactionDetail transactionDetail = transactionDetailService.getTransactionDetailById(transactionDetailId);
        Transaction transaction = transactionService.getTransactionById(id);

        if (transaction != null) {
            transaction.getTransactionDetails().add(transactionDetail);
        }
        saveTransaction(transaction);
        model.addAttribute("transaction", transactionService.getTransactionById(id));
        model.addAttribute("transactionDetails", transactionService.getTransactionById(id).getTransactionDetails());
        return "redirect:/transaction/" + transaction.getId();
    }

}
