package org.zyq.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.zyq.bean.Account;
import org.zyq.dao.AccountDao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void run() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //创建sqlsessionfactory对象
        SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(in);
        //创建sqlsession对象
        SqlSession session = factory.openSession();
        //获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        List<Account> accounts = dao.finAll();
        for(Account account: accounts){
            System.out.println(account);

        }


    }

}
