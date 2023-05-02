package org.jasmine.ecommerce.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.jasmine.ecommerce.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    //define entity manager
    private EntityManager entityManager;

    //inject manager using constrcutor injecti0on
    @Autowired
    public UserDaoImpl(EntityManager manager) {
        //constructor injection
        entityManager = manager;
    }

    @Override
    public User findbyId(int id) {
        User user = entityManager.find(User.class, id);
        return user;
    }
/*xpublic User findbyId(int id) {
        User users = entityManager.find(User.class, id);
        return users;
    }*/
    @Override
    public void deletebyId(int id) {
//        find
        User users = entityManager.find(User.class, id);
        entityManager.remove(users);
    }

    //@ transactional will handle at service layer
    @Override
    public User save(User user) {

//        if id == 0 -> it would insert instead of update
        User object = entityManager.merge(user);
        return object;
    }

    @Override
    public List<User> findAll() {
        //create a query and get result list
        TypedQuery<User> query = entityManager.createQuery("from User ", User.class);

        //execute query
        List<User> users = query.getResultList();

        //return results
        return users;
    }

}
