package org.jasmine.ecommerce.service;

import jakarta.transaction.Transactional;
import org.jasmine.ecommerce.dao.UserRepository;
import org.jasmine.ecommerce.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        userRepository = repository;
    }

    @Override
    public User findbyId(int id) {

        Optional<User> result = userRepository.findById(id);
        User user = null;
        if(result.isPresent()) {
            user = result.get();
        } else {
            throw new RuntimeException("did not find user id: " + id);
        }
        return user;
    }

    @Override
    public void deletebyId(int id) {
        userRepository.deleteById(id);
    }


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
