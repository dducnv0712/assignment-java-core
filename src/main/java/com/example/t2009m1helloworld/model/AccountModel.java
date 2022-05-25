package com.example.t2009m1helloworld.model;

import com.example.t2009m1helloworld.entity.Account;

import java.util.List;

public interface AccountModel {
    boolean Save(Account account);
    boolean Update (int id, Account updateAccount);
    boolean Delete (int id);
    List<Account> getAll();
    Account findById(int id);
}
