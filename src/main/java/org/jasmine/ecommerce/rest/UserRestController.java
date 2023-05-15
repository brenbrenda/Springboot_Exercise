package org.jasmine.ecommerce.rest;

import org.jasmine.ecommerce.dao.UserDao;
import org.jasmine.ecommerce.entity.User;
import org.jasmine.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    private UserService userService;

    @Autowired
    public UserRestController(UserService service) {
        userService = service;
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/users/{userid}")
    public User getUsers(@PathVariable int userid) {

        try {
            User user = userService.findbyId(userid);
            if (user == null) { //this is not work
                throw new RuntimeException("User id not found" + userid);
            }
            return user;

        } catch (Exception e) {
            System.out.println("error occurred" + e);
            return null;
        }
    }

    //add
    @PostMapping("/User")
    public User addUser(@RequestBody User user) {
        //force to add object instead of update it.
        user.setUserid(user.getUserid());

        User object = userService.save(user);
        return object;
    }

    //update
    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {

        User object = userService.save(user);
        return object;
    }

    //delete
    @DeleteMapping("/users/{userid}")
    public String delete(@PathVariable int userid) {

        User user = userService.findbyId(userid);

        if(user == null) {
            throw new RuntimeException("employee id not found" + userid);

        }
        userService.deletebyId(userid);
        return "deleted success" + userid;
//        try {
//            Sales sales = salesService.findbyId(sales_id);
//            salesService.deletebyId(sales_id);
//            return  true;
//
//        } catch (RuntimeException e) {
//            System.out.println("run time error occurred" + e);
//            return false;
//        } catch (Exception e) {
//            System.out.println("error occurred" + e);
//            return false;
//        }

    }


}
