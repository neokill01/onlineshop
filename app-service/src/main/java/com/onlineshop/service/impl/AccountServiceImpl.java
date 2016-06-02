package com.onlineshop.service.impl;

import com.onlineshop.model.User;
import com.onlineshop.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * Created by neo on 16/6/3.
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public User register(User user) {
        return user;
    }
}
