package com.hungta.service;

import com.github.pagehelper.PageInfo;
import com.hungta.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HUNGTA on 01/08/18 - 10:34 PM
 * @project restfulmybatis
 */

public interface OrderService {
    Order createOrder(Order order);

    Boolean updateOrder(Order order);

    Boolean deleteOrder(String orderId);

    Order findByOrderName(String orderName);

    Order findByOrderId(String orderId);

    List<Order> findAll();

    PageInfo<Order> findAllPaging(int pageNum, int pageSize);

    boolean exists(Order order);
}
