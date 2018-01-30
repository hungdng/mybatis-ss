package com.hungta.service.Impl;

import com.github.pagehelper.PageInfo;
import com.hungta.dao.OrderDao;
import com.hungta.entity.Order;
import com.hungta.service.OrderService;
import com.hungta.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author HUNGTA on 01/08/18 - 10:35 PM
 * @project restfulmybatis
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;


    @Override
    public Order createOrder(Order order) {
        return null;
    }

    @Override
    public Boolean updateOrder(Order order) {
        return null;
    }

    @Override
    public Boolean deleteOrder(String orderId) {
        return null;
    }

    @Override
    public Order findByOrderName(String orderName) {
        return null;
    }

    @Override
    public Order findByOrderId(String orderId) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return orderDao.findAll();
    }

    @Override
    public PageInfo<Order> findAllPaging(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public boolean exists(Order order) {
        return false;
    }
}
