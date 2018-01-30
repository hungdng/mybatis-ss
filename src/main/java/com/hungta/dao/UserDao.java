package com.hungta.dao;

import com.hungta.entity.User;

public interface UserDao extends BaseDao<User>{
    User findByUsername (String username);
}
