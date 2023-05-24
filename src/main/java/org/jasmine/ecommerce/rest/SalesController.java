package org.jasmine.ecommerce.rest;

import org.jasmine.ecommerce.entity.Sales;
import org.jasmine.ecommerce.service.SalesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sales")
public class SalesController {

    private List<Sales> sales;
    private SalesService service;

    public SalesController(SalesService salesService) {
        service = salesService;
    }


    @GetMapping("/list")
    public String listSales(Model model) {

        sales = service.findAll();
        model.addAttribute("sales", sales);
        return "salelist";
    }

    @PostMapping("/save")
    public String saveSales(@ModelAttribute("sales") Sales sale) {
        service.save(sale);
//        return "redirect:/sales/list";
        return "redirect:/sales/order";
    }


    @GetMapping("/newOrder")
    public String newOrder(Model model) {
        //create model
        Sales sale = new Sales();
        model.addAttribute("sales", sale);
        return "newOrder";
    }

    @GetMapping("/updateOrder")
    public String updateOrder(@RequestParam("sales_id") int id, Model model) {

        //get the sales from service
        Sales sale = service.findbyId(id);
        model.addAttribute("sales", sale);

        return "newOrder";
    }
    @GetMapping("/deleteOrder")
    public String deleteOrder(@RequestParam("sale_id") int id, Model model) {

        service.deletebyId(id);
        return "redirect:/manage";
    }


    @GetMapping("/order")
    public String cart(Model model) {
        sales = service.findAll();
        model.addAttribute("sales", sales);
        return "cart";

    }
    @GetMapping("/product")
    //TO DO: oyt it in the other product servlet
    public String product(Model model) {
        sales = service.findAll();
        model.addAttribute("sales", sales);
        return "product";

    }
}

