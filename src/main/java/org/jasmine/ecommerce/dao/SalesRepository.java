package org.jasmine.ecommerce.dao;

import org.jasmine.ecommerce.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Integer> {

}
