package org.zyq.service;

import org.zyq.bean.Account;

import java.util.List;


public interface AccountService {
    //查询所有的账户信息
    public List<Account> finAll();

    //保存账户信息
    public void saveAccount(Account account);

    public Account isextis(Account account);


}
