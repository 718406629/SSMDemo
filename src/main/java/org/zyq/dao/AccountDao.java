package org.zyq.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.zyq.bean.Account;

import java.util.List;

/**
 * 账户接口
 */
@Repository
public interface AccountDao {
    //查询所有的账户信息
    @Select("select * from account")
    public List<Account> finAll();

    //保存账户信息
    @Insert("insert into account(names,money) values(#{names},#{money})")
    public void saveAccount(Account account);

    @Select("select * from account where id=#{id} and names=#{names}")//查询条件里面只能是属性，不能包含对象.属性
    public Account isextis(Account account) ;

}
