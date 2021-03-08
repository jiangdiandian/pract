package com.tiedao.service;

import com.tiedao.domain.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();
    public void Save(Account account);
    public Account findById(Integer Id);
    public void update(Account account);
    public void deleteBatch(Integer[] ids);
}
