package com.hungta.service;

import com.hungta.entity.User;

public interface UserService {

    public User get(long id);

    public User findByUsername (String username);

    public void insert(User entity);

    public void update(User entity);

    public void deleteById(long id);
}
