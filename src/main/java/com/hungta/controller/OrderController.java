package com.hungta.controller;

import com.github.pagehelper.PageInfo;
import com.hungta.entity.Order;
import com.hungta.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author HUNGTA on 01/08/18 - 10:50 PM
 * @project restfulmybatis
 */
@RestController
@RequestMapping("orders")
public class OrderController extends BaseController {
    @Autowired
    OrderService orderService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.findAll());
        /*UserDetails user = customUserDetailsService.loadUserByUsername("admin");
        return ResponseEntity.status(HttpStatus.OK).body(user);*/
    }

    @GetMapping("/page")
    public ResponseEntity<?> getAllPaging(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        PageInfo<Order> orderPageInfo = orderService.findAllPaging(pageNum, pageSize);
        return ResponseEntity.status(HttpStatus.OK).body(orderPageInfo);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<?> getByOrderId(@PathVariable("orderId") String orderid) {
        try {
            Order order = orderService.findByOrderId(orderid);
            if (order == null)
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            return ResponseEntity.status(HttpStatus.OK).body(order);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody Order order) {
        try {
            Order orderDb = orderService.findByOrderName(order.getOrderName());
            if (orderDb != null)
                return ResponseEntity.status(HttpStatus.CONFLICT).build();
            else {
                Order orderResponse = orderService.createOrder(order);
                if (orderResponse != null)
                    return ResponseEntity.status(HttpStatus.CREATED).body(orderResponse);
                return ResponseEntity.badRequest().build();
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Order order) {
        try {
            Order orderDb = orderService.findByOrderId(order.getOrderId());
            if (orderDb == null)
                return ResponseEntity.noContent().build();
            else {
                if (orderService.updateOrder(order))
                    return ResponseEntity.ok(order);
                return ResponseEntity.badRequest().build();
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<?> delete(@PathVariable("orderId") String orderid) {
        try {
            if (orderService.deleteOrder(orderid))
                return ResponseEntity.ok().build();
            return ResponseEntity.badRequest().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
