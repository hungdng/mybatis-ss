package com.hungta.dao;

import java.util.List;

public interface BaseDao<T> {

   T findById(long id);

   List<T> findAll();

   T findByName(String name);

   void insert(T entity);

   void update(T entity);

   void deleteById(long id);



}
