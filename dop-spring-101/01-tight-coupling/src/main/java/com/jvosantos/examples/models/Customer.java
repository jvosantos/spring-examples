package com.jvosantos.examples.models;

import java.util.List;
import java.util.LinkedList;

public class Customer {

    private List<Order> orders = new LinkedList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return new LinkedList<>(orders);
    }
}
