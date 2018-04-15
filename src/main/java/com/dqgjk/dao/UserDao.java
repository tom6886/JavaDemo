package com.dqgjk.dao;

import com.dqgjk.domain.Guser;

import java.io.Serializable;

public interface UserDao extends Dao<Guser> {
    int add(Guser user);

    int del(Guser user);

    int update(Guser user);

    @Override
    Guser findOneById(Serializable Id);

    Guser findByAccountAndPwd(String account, String pwd);
}
