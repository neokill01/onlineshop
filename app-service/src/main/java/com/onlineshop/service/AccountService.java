package com.onlineshop.service;

import com.onlineshop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by neo on 16/6/2.
 */

@Service
public interface AccountService {
    void register(User user);
}
