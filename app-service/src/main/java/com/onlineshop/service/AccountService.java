package com.onlineshop.service;

import com.onlineshop.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by neo on 16/6/2.
 */

@Component
public interface AccountService {
    User register(User user);
}
