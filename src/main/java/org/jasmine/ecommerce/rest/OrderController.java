package org.jasmine.ecommerce.rest;



import org.jasmine.ecommerce.entity.Order;
import org.jasmine.ecommerce.service.OrderService;
import org.jasmine.ecommerce.service.SalesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private List<Order> orders;
    private OrderService service;

    public OrderController(OrderService orderService) {
        service = orderService;
    }


    @GetMapping("/list")
    public String listOrders(Model model) {

        orders = service.findAll();
        model.addAttribute("orders", orders);
        return "cart";
    }

    @PostMapping("/save")
    public String saveSales(@ModelAttribute("orders") Order order) {
        service.save(order);
        return "redirect:/orders/list";
    }


    @GetMapping("/newOrder")
    public String newOrder(Model model) {
        //create model
        Order order = new Order();
        model.addAttribute("orders", order);
        return "newOrder";
    }

    @GetMapping("/updateOrder")
    public String updateOrder(@RequestParam("order_id") int id, Model model) {

        //get the sales from service
        Order order = service.findbyId(id);
        model.addAttribute("orders", order);

        return "newOrder";
    }
    @GetMapping("/deleteOrder")
    public String deleteOrder(@RequestParam("order_id") int id, Model model) {

        service.deletebyId(id);
        return "redirect:/manage";
    }


    @GetMapping("/getOrder")
    public String cart(@RequestParam("order_id") int id,Model model) {
        orders = service.findAll();
        model.addAttribute("orders", orders);
        return "cart";

    }

}

