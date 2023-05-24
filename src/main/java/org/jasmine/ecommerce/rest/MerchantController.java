package org.jasmine.ecommerce.rest;

import org.jasmine.ecommerce.entity.Merchants;
import org.jasmine.ecommerce.entity.Sales;
import org.jasmine.ecommerce.service.MerchantService;
import org.jasmine.ecommerce.service.SalesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/merchants")
public class MerchantController {

    private List<Merchants> merchants;
    private MerchantService service;
    public MerchantController(MerchantService merchantService) {
        service = merchantService;
    }


    @GetMapping("/list")
    public String listSales(Model model) {

        merchants = service.findAll();
        model.addAttribute("merchants", merchants);
        return "salelist";
    }

    @PostMapping("/save")
    public String saveSales(@ModelAttribute("merchants") Merchants merchants) {
        service.save(merchants);
//        return "redirect:/sales/list";
        return "redirect:/sales/manage";
    }


    @GetMapping("/login")
    public String login() {
        return "merchantLogin";
    }

    @PostMapping("/loginAction")
    public String loginAction() {
        return "cart";
    }

    @GetMapping("/register")
    public String register(Model model) {
        //create model
        Merchants merchants = new Merchants();
        model.addAttribute("merchants", merchants);
        return "merchantRegister";
    }

    @GetMapping("/updateOrder")
    public String updateOrder(@RequestParam("id") int id, Model model) {

        //get the sales from service
        Merchants merchants = service.findbyId(id);
        model.addAttribute("merchants", merchants);

        return "newOrder";
    }
    @GetMapping("/deleteOrder")
    public String deleteOrder(@RequestParam("id") int id, Model model) {

        service.deletebyId(id);
        return "redirect:/sales/list";
    }

    @GetMapping("/manage")
    public String manageorder(Model model) {
        merchants = service.findAll();
        model.addAttribute("merchants", merchants);
        return "manageorder";
    }

    @GetMapping("/test")
    public String test() {
        return "cart";
    }

}

