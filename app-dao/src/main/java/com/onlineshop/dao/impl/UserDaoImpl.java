package com.onlineshop.dao.impl;

import com.onlineshop.dao.UserDao;
import com.onlineshop.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by neo on 16/6/3.
 */
@Repository
public class UserDaoImpl implements UserDao {

    /**
     * Hibernate 6 起 Spring 不再提供 HibernateTemplate，
     * 统一使用 JPA EntityManager（由 OpenEntityManagerInViewFilter 管理会话生命周期）。
     */
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = false)
    public void createUser(User user) {
        entityManager.persist(user);
    }

    public List<User> getUserByIds(List<String> ids) {
        return null;
    }

    public List<User> findAllUser() {
        return null;
    }
}
