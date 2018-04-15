package com.dqgjk.service;

import com.dqgjk.domain.Guser;

import java.util.List;

public interface UserService extends BaseService<Guser> {

    Guser findByAccountAndPwd(String account, String pwd);

    List<Guser> findAll(int pageNum, int pageSize);
}
