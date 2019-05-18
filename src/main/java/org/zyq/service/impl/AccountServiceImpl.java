package org.zyq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zyq.bean.Account;
import org.zyq.dao.AccountDao;
import org.zyq.service.AccountService;

import java.util.List;
@Service("accountService")//注解放入实现类，不可放到接口上
public class AccountServiceImpl implements AccountService {
     @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> finAll() {
        System.out.println("业务层，查询所有账户");
        return accountDao.finAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户");
        accountDao.saveAccount(account);
    }

    @Override
    public Account isextis(Account account) {
        return accountDao.isextis(account);
    }


}
