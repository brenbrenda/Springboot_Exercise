package org.jasmine.ecommerce.service;

import org.jasmine.ecommerce.entity.Merchants;


import java.util.List;

public interface MerchantService {
    Merchants findbyId(int id);

    void deletebyId(int id);

    Merchants save(Merchants sales);

    List<Merchants> findAll();
}
