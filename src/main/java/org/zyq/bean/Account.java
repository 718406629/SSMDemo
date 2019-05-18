package org.zyq.bean;

import java.io.Serializable;

/**
 * 账户
 */
public class Account implements Serializable {
    private  Integer id;
    private String names;
    private double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", money=" + money +
                '}';
    }
}
