package com.tiedao.test;

import com.tiedao.domain.Account;
import com.tiedao.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class ServiceTest {
    @Autowired
    private AccountService AccountService;
    @Test
    public void testService(){
        List<Account> all = AccountService.findAll();
        System.out.println(all);
    }
}
