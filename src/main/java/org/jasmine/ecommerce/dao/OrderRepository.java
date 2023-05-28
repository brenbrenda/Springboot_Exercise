package org.jasmine.ecommerce.dao;

import org.jasmine.ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepository extends JpaRepository<Order, Integer> {

}