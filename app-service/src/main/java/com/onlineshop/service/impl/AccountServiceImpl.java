package com.onlineshop.service.impl;

import com.onlineshop.dao.UserDao;
import com.onlineshop.model.User;
import com.onlineshop.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by neo on 16/6/3.
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        userDao.createUser(user);
    }
}
