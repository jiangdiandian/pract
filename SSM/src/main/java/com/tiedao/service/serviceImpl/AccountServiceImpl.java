package com.tiedao.service.serviceImpl;

import com.tiedao.dao.AccountDao;
import com.tiedao.domain.Account;
import com.tiedao.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override

    public List<Account> findAll() {
        List<Account> all = accountDao.findAll();
        return all;
    }

    @Override
    public void Save(Account account) {
        accountDao.save(account);
    }

    @Override
    public Account findById(Integer Id) {
        return accountDao.findById(Id);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public void deleteBatch(Integer[] ids) {
         accountDao.deleteBatch(ids);
    }
}
