package com.hungta.entity;

import java.io.Serializable;

/**
 * @author HUNGTA on 01/08/18 - 10:26 PM
 * @project restfulmybatis
 */
public class Order implements Serializable {

    private String orderId;
    private String orderName;
    private String productName;
    private int quantity;
    private int price;
    private String type;
    private int total;
    private int customerId;
    private String customerName;
    private String orderDate;
    private String status;

    public Order() {
    }

    public Order(String orderId, String orderName, String productName, int quantity, int price, String type, int total,
                 int customerId, String customerName, String orderDate, String status) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
        this.total = total;
        this.customerId = customerId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
