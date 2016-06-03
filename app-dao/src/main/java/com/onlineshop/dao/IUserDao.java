package com.onlineshop.dao;

import com.onlineshop.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by neo on 16/6/3.
 */
@Component
public interface IUserDao {
    void createUser(User user);
    List<User> findAllUser();
    List<User> getUserByIds(List<String> ids);
}
