package com.onlineshop.dao.impl;

import com.onlineshop.dao.IUserDao;
import com.onlineshop.model.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by neo on 16/6/3.
 */
@Transactional
@Component("userDao")
public class UserDao extends HibernateDaoSupport implements IUserDao {
    @Override
    public void createUser(User user) {
        getHibernateTemplate().save(user);
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
