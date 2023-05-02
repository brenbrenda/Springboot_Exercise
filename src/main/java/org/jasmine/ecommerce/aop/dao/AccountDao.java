package org.jasmine.ecommerce.aop.dao;


import org.springframework.stereotype.Component;

@Component
public class AccountDao {

    public void addAccount() {
        System.out.println(getClass() + " DOING AOP");
    }

}
