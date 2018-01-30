package com.hungta.dao;

import com.github.pagehelper.Page;
import com.hungta.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author HUNGTA on 01/08/18 - 9:49 PM
 * @project restfulmybatis
 */
public interface OrderDao extends BaseDao<Order> {

}
