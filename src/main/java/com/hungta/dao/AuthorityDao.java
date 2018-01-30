package com.hungta.dao;

import com.hungta.entity.Authority;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author HUNGTA on 01/21/18 - 11:34 PM
 * @project restful-mybatis
 */
public interface AuthorityDao extends BaseDao<Authority> {
    List<Authority>findByUserId(long userId);
}
