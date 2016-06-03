package com.onlineshop.dao.impl;

import com.onlineshop.dao.UserDao;
import com.onlineshop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by neo on 16/6/3.
 */
@Transactional
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    public void createUser(User user) {
        hibernateTemplate.save(user);
    }

    @Override
    public List<User> getUserByIds(List<String> ids) {
        return null;
    }

    @Override
    public List<User> findAllUser() {
        return null;
    }
}
