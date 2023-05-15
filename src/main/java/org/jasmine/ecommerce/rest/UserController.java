package org.jasmine.ecommerce.rest;


import org.jasmine.ecommerce.entity.Sales;
import org.jasmine.ecommerce.entity.User;
import org.jasmine.ecommerce.service.SalesService;
import org.jasmine.ecommerce.service.UserService;
import org.jasmine.ecommerce.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private List<User> user;

    private UserService service;

    public UserController(UserService userService) {
        service = userService;
    }


    @GetMapping("/list")
    public String listUsers(Model model) {

        user = service.findAll();
        model.addAttribute("user", user);
        return "userlist";
    }


    @GetMapping("/userprofile")
    public String userProfile(@ModelAttribute("user") User user) {

        return "userprofile";
    }

    @PostMapping("/save")
    public String saveUserProfile(@ModelAttribute("user") User user) {
        service.save(user);
        return "redirect:/user/list";
    }


/*
@GetMapping("/newOrder")
    public String newOrder(Model model) {
        //create model
        Sales sale = new Sales();
        model.addAttribute("sales", sale);
        return "newOrder";
    }
 */
    @GetMapping("/register")
    public String register(Model model) {
        //create model
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }

    @GetMapping("/updateOrder")
    public String updateOrder(@RequestParam("user_id") int id, Model model) {

        //get the sales from service
        User user = service.findbyId(id);
        model.addAttribute("user", user);
        return "register";
    }
}
