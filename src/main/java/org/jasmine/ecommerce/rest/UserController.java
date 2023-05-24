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
@RequestMapping("/users")
public class UserController {

    private List<User> user;

    private UserService service;

    public UserController(UserService userService) {
        service = userService;
    }


    @GetMapping("/list")
    public String listUsers(Model model) {

        user = service.findAll();
        model.addAttribute("users", user);
        return "userlist";
    }


    @GetMapping("/userprofile")
    public String userProfile(@ModelAttribute("users") User user) {

        return "userprofile";
    }

    @PostMapping("/save")
    public String saveUserProfile(@ModelAttribute("users") User user) {
        service.save(user);
        return "redirect:/users/list";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/loginAction")
    public String loginAction() {

        return "product";

    }





/*
@GetMapping("/newOrder")
    public String newOrder(Model model) {
        //create model
        Sales sale = new Sales();
        model.addAttribute("salesm", sale);
        return "newOrder";
    }

     @PostMapping("/save")
    public String saveSales(@ModelAttribute("sales") Sales sale) {
        service.save(sale);
//        return "redirect:/sales/list";
        return "redirect:/sales/order";
    }
 */
    @GetMapping("/register")
    public String register(Model model) {
        //create model
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }

    @GetMapping("/updateUser")
    public String updateUser(@RequestParam("id") int id, Model model) {

        //get the sales from service
        User user = service.findbyId(id);
        model.addAttribute("user", user);
        return "register";
    }
}
