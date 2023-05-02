package org.jasmine.ecommerce.dao;

import org.jasmine.ecommerce.entity.User;

import java.util.List;

public interface UserDao {
    User findbyId(int id);

    void deletebyId(int id);

    User save(User user);

    List<User> findAll();
}


