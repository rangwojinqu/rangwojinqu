package com.kj.controller;

import com.github.pagehelper.PageInfo;
import com.kj.domain.Account;
import com.kj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAccount")
    public List<Account> findAll(){
        return accountService.findAll();
    }
    @GetMapping("/testPageHelper1")
    public PageInfo<Account> testPageHelper1(Model model){
        PageInfo<Account> queryResult = accountService.findAllAccountByPageS(1, 5);
        model.addAttribute("pageInfo",queryResult);
        return queryResult;
    }

    @RequestMapping("/testPageHelper2")
    public List<Account> testPageHelper2(Model model){
        List<Account> queryResult = accountService.findAllAccountByPageF(1, 5);
        model.addAttribute("pageInfo",queryResult);
        return queryResult;
    }

}
