package org.jasmine.ecommerce.dao;

import org.jasmine.ecommerce.entity.Sales;

import java.util.List;

public interface SalesDao {

    Sales findbyId(int id);

    void deletebyId(int id);

    Sales save(Sales sales);

    List<Sales> findAll();


}
