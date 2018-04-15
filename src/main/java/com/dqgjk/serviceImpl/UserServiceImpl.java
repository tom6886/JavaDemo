package com.dqgjk.serviceImpl;


import com.dqgjk.dao.UserDao;
import com.dqgjk.domain.Guser;
import com.dqgjk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Guser findByAccountAndPwd(String account, String pwd) {
        return userDao.findByAccountAndPwd(account, pwd);
    }

    @Override
    public List<Guser> findAll(int pageNum, int pageSize) {
        return null;
    }
}
