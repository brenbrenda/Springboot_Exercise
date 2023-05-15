package org.jasmine.ecommerce.service;

import org.jasmine.ecommerce.dao.MerchantRepository;
import org.jasmine.ecommerce.entity.Merchants;
import org.jasmine.ecommerce.entity.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MerchantServiceImpl implements MerchantService {

    private MerchantRepository merchantRepository;

    @Autowired
    public MerchantServiceImpl(MerchantRepository repository) {
        merchantRepository = repository;
    }
    @Override
    public Merchants findbyId(int id) {
        Optional<Merchants> result = merchantRepository.findById(id);

        Merchants merchants = null;
        if(result.isPresent()) {
            merchants = result.get();
        } else {
            throw new RuntimeException("did not find id" + id);
        }
        return merchants;
    }

    @Override
    public void deletebyId(int id) {
        merchantRepository.deleteById(id);
    }

    @Override
    public Merchants save(Merchants merchants) {
        return merchantRepository.save(merchants);
    }

    @Override
    public List<Merchants> findAll() {
        return merchantRepository.findAll();
    }
}
