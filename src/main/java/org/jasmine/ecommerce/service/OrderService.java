package org.jasmine.ecommerce.service;

import org.jasmine.ecommerce.entity.Order;


import java.util.List;

public interface OrderService {
    Order findbyId(int id);

    void deletebyId(int id);

    Order save(Order sales);

    List<Order> findAll();
}
