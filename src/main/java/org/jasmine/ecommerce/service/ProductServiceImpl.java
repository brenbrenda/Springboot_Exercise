package org.jasmine.ecommerce.service;

import org.jasmine.ecommerce.dao.MerchantRepository;
import org.jasmine.ecommerce.dao.ProductRepository;
import org.jasmine.ecommerce.entity.Merchants;
import org.jasmine.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository repository) {
        productRepository = repository;
    }
    @Override
    public Product findbyId(int id) {
        Optional<Product> result = productRepository.findById(id);

        Product product = null;
        if(result.isPresent()) {
            product = result.get();
        } else {
            throw new RuntimeException("did not product find id" + id);
        }
        return product;
    }

    @Override
    public void deletebyId(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
