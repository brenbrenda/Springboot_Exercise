package org.jasmine.ecommerce.service;

import org.jasmine.ecommerce.entity.User;

import java.util.List;

public interface UserService {
    User findbyId(int id);

    void deletebyId(int id);

    User save(User user);

    List<User> findAll();
}
