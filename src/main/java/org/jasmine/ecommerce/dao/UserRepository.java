package org.jasmine.ecommerce.dao;

import org.jasmine.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

}


