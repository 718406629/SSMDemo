package org.zyq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zyq.bean.Account;
import org.zyq.service.AccountService;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/test")
    public String test(Model model) {
        System.out.println("表现层，查询所有账户");
        List<Account> accounts = accountService.finAll();
        model.addAttribute("accounts", accounts);
        return "seccess";
    }

    @RequestMapping("/login")
    public String login(Account account) {
     Account account1  =accountService.isextis(account);
    if(account1!=null){
        return "yes";
    }
     else return "no";
    }

    @RequestMapping("/save")
    public String save(Account account){
        accountService.saveAccount(account);
        System.out.println("保存成功！");
        return "yes";
    }




}
