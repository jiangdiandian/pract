package com.tiedao.dao;

import com.tiedao.domain.Account;

import java.util.List;

public interface AccountDao {
    public List<Account> findAll();
    public void save(Account account);
    public Account findById(Integer id);
    public void update(Account account);
    public void deleteBatch(Integer[] ids);
}
