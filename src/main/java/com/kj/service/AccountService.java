package com.kj.service;

import com.github.pagehelper.PageInfo;
import com.kj.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();

    List<Account> findAllAccountByPageF(int pageNum, int pageSize);

    PageInfo<Account> findAllAccountByPageS(int pageNum, int pageSize);
}
