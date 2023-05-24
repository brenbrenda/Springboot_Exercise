package org.jasmine.ecommerce.rest;

import org.jasmine.ecommerce.entity.Product;
import org.jasmine.ecommerce.entity.Sales;
import org.jasmine.ecommerce.service.ProductService;
import org.jasmine.ecommerce.service.SalesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {


    private List<Product> product;
    private ProductService service;

    public ProductController(ProductService productService) {
        service = productService;
    }


    @GetMapping("/list")
    public String listSales(Model model) {

        product = service.findAll();
        model.addAttribute("product", product);
        return "product";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product) {
        service.save(product);
        return "redirect:/product/list";
    }


    @GetMapping("/newItem")
    public String newItem(Model model) {
        //create model
        Product product = new Product();
        model.addAttribute("product", product);
        return "newProduct";
    }

    @GetMapping("/updateItem")
    public String updateItem(@RequestParam("id") int id, Model model) {

        //get the sales from service
        Product product = service.findbyId(id);
        model.addAttribute("product", product);

        return "product";
    }
//    @GetMapping("/deleteItem")
//    public String deleteItem(@RequestParam("sale_id") int id, Model model) {
//
//        service.deletebyId(id);
//        return "redirect:/manage";
//    }

}
