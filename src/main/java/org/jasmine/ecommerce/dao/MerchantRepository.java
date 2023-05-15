package org.jasmine.ecommerce.dao;

import org.jasmine.ecommerce.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MerchantRepository extends JpaRepository<Merchants, Integer> {

}
