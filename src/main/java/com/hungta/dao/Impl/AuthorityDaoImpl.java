package com.hungta.dao.Impl;

import com.hungta.dao.AuthorityDao;
import com.hungta.entity.Authority;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorityDaoImpl extends BaseDaoImpl<Authority> implements AuthorityDao {

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    private String ns;

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    @Override
    public List<Authority> findByUserId(long userId) {
        return this.getSqlSession().selectList(ns + ".findByUserId", userId);
    }
}
