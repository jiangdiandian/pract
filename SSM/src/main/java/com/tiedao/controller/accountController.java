package com.tiedao.controller;

import com.tiedao.domain.Account;
import com.tiedao.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@RequestMapping("/account")
public class accountController {
    @Autowired
    private AccountService AccountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> all = AccountService.findAll();
        model.addAttribute("list",all);
        return "list";
    }
    @RequestMapping("/save")
    public String save(Account account){
      AccountService.Save(account);
      return "redirect:/account/findAll";
    }
    @RequestMapping("/findById")
    public String findById(Integer id,Model model){
        Account account = AccountService.findById(id);
        model.addAttribute("account",account);
        return "update";
    }
    @RequestMapping("/update")
    public String update(Account account){
        AccountService.update(account);
        return "redirect:/account/findAll";
    }
    @RequestMapping("/deleteBatch")
    public String deleteBatch(Integer[] ids){
        AccountService.deleteBatch(ids);
        return "redirect:/account/findAll";
    }
}
