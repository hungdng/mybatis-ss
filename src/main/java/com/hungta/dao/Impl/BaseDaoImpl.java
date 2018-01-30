
package com.hungta.dao.Impl;



import com.hungta.dao.BaseDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public abstract class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T> {
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    private String ns;        //(namespace )

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }


    public T findById(long id) {
        return this.getSqlSession().selectOne(ns + ".findById", id);
    }

    public List<T> findAll() {
        return this.getSqlSession().selectList(ns + ".findAll");
    }

    public T findByName(String name){
        return this.getSqlSession().selectOne(ns + ".findByName", name);
    }

    public void insert(T entity) {
        this.getSqlSession().insert(ns + ".insert", entity);
    }

    public void update(T entity) {
        this.getSqlSession().update(ns + ".update", entity);
    }

    public void deleteById(long id) {

        this.getSqlSession().delete(ns + ".deleteById", id);
    }


}
