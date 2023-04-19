//package org.jasmine.ecommerce.service;
//
//import jakarta.transaction.Transactional;
//import org.jasmine.ecommerce.dao.SalesDao;
//import org.jasmine.ecommerce.dao.SalesRepository;
//import org.jasmine.ecommerce.entity.Sales;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class SalesServiceImpl implements SalesService {
//
//
//    private SalesRepository salesRepository;
//
//    @Autowired
//    public SalesServiceImpl(SalesRepository repository) {
//        salesRepository = repository;
//    }
//
//    @Override
//    public Sales findbyId(int id) {
//        Optional<Sales> result = salesRepository.findById(id);
//
//        Sales sales = null;
//        if(result.isPresent()) {
//            sales = result.get();
//        } else {
//            throw new RuntimeException("did not find id" + id);
//        }
//        return sales;
//    }
//
//    @Override
//    public void deletebyId(int id) {
//        salesRepository.deleteById(id);
//    }
//
//
//    @Override
//    public Sales save(Sales sales) {
//        return salesRepository.save(sales);
//    }
//
//    @Override
//    public List<Sales> findAll() {
//        return salesRepository.findAll();
//    }
//}
