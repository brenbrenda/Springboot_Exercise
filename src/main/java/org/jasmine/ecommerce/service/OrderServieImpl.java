package org.jasmine.ecommerce.service;

import org.jasmine.ecommerce.dao.OrderRepository;
import org.jasmine.ecommerce.dao.SalesRepository;
import org.jasmine.ecommerce.entity.Order;
import org.jasmine.ecommerce.entity.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServieImpl implements OrderService {

    private OrderRepository orderRepository;


    @Autowired
    public OrderServieImpl(OrderRepository repository) {
        orderRepository = repository;
    }


    @Override
    public Order findbyId(int id) {
        Optional<Order> result = orderRepository.findById(id);

        Order orders = null;
        if(result.isPresent()) {
            orders = result.get();
        } else {
            throw new RuntimeException("did not find id" + id);
        }
        return orders;
    }

    @Override
    public void deletebyId(int id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}