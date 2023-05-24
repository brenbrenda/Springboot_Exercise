package org.jasmine.ecommerce.service;

import org.jasmine.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {

    Product findbyId(int id);

    void deletebyId(int id);

    Product save(Product product);

    List<Product> findAll();
}
