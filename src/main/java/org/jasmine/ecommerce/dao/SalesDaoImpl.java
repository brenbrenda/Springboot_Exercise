package org.jasmine.ecommerce.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.jasmine.ecommerce.entity.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SalesDaoImpl implements SalesDao{

    //define entity manager
    private EntityManager entityManager;

    //inject manager using constrcutor injecti0on
    @Autowired
    public SalesDaoImpl(EntityManager manager) {
        //constructor injection
        entityManager = manager;
    }

    @Override
    public Sales findbyId(int id) {
        Sales sales = entityManager.find(Sales.class, id);
        return sales;
    }

    @Override
    public void deletebyId(int id) {
//        find
        Sales sales = entityManager.find(Sales.class, id);
        entityManager.remove(sales);
    }

    //@ transactional will handle at service layer
    @Override
    public Sales save(Sales sales) {

//        if id == 0 -> it would insert instead of update
        Sales object = entityManager.merge(sales);
        return object;
    }

    @Override
    public List<Sales> findAll() {
        //create a query and get result list
        TypedQuery<Sales> query = entityManager.createQuery("from Sales", Sales.class);

        //execute query
        List<Sales> sales = query.getResultList();

        //return results
        return sales;
    }


}
