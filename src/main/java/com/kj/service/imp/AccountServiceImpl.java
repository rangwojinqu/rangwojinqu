package com.kj.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kj.dao.AccountDao;
import com.kj.domain.Account;
import com.kj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
    @Override
    public List<Account> findAllAccountByPageF(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Account> lists = accountDao.findAll();
        return lists;
    }

    @Override
    public PageInfo<Account> findAllAccountByPageS(int pageNum, int pageSize) {
        // TODO Auto-generated method stub
        PageHelper.startPage(pageNum, pageSize);
        List<Account> lists = accountDao.findAll();
        PageInfo<Account> pageInfo = new PageInfo<Account>(lists);
        return pageInfo;

    }
}
