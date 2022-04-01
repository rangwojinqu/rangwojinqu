package com.kj.dao;

import com.kj.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface AccountDao {
    @Select("select * from account")
    public List<Account> findAll();
}
