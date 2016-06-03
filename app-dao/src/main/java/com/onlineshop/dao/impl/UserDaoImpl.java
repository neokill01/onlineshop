package com.onlineshop.dao.impl;

import com.onlineshop.dao.UserDao;
import com.onlineshop.model.User;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by neo on 16/6/3.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Resource
    private HibernateTemplate hibernateTemplate;

    @Transactional(readOnly = false)
    public void createUser(User user) {
        hibernateTemplate.save(user);
    }

    public List<User> getUserByIds(List<String> ids) {
        return null;
    }

    public List<User> findAllUser() {
        return null;
    }
}
