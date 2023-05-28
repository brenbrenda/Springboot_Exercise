package org.jasmine.ecommerce.rest;

import org.jasmine.ecommerce.entity.Order;
import org.jasmine.ecommerce.entity.Sales;
import org.jasmine.ecommerce.service.OrderService;
import org.jasmine.ecommerce.service.SalesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ThymleafDemo {


    //tester
    private List<Order> orders;
    private OrderService service;

    public ThymleafDemo(OrderService salesService) {
        service = salesService;
    }

    @GetMapping("/")
    public String main() {
        return "index";
    }

    //
    @GetMapping("/time")
    public String time(Model model) {
        //singelton -> true, prototype ->false
        model.addAttribute("theDate", new java.util.Date());
        return "datetime";

    }

//    @GetMapping("/manage")
//    public String cart(Model model) {
//        sales = service.findAll();
//        model.addAttribute("sales", sales);
//        return "cart";
//
//    }

    @GetMapping("/product")
    public String product(Model model) {
        orders = service.findAll();
        model.addAttribute("sales", orders);
        return "product";

    }

    @GetMapping("/men")
    public String item() {
//        sales = service.findAll();
//        model.addAttribute("sales", sales);
        return "men";

    }
    @GetMapping("/order")
    public String order(Model model) {
        orders = service.findAll();
        model.addAttribute("orders", orders);
        return "manageorder";

    }
}
