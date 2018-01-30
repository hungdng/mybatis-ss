package com.hungta.service.Impl;

import com.hungta.dao.UserDao;
import com.hungta.entity.User;
import com.hungta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HUNGTA on 01/23/18 - 1:07 AM
 * @project restful-mybatis
 */
@Service
public class UserDetailImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User get(long id) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public void insert(User entity) {

    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void deleteById(long id) {

    }
}
