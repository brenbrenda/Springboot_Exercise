//package org.jasmine.ecommerce.rest;
//
//import org.jasmine.ecommerce.dao.SalesDao;
//import org.jasmine.ecommerce.entity.Sales;
//import org.jasmine.ecommerce.service.SalesService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class SalesRestController {
//
//    private SalesService salesService;
//
//    @Autowired
//    public SalesRestController(SalesService service) {
//        salesService = service;
//    }
//
//    @GetMapping("/sales")
//    public List<Sales> findAll() {
//        return salesService.findAll();
//    }
//
//    @GetMapping("/sales/{sales_id}")
//    public Sales getSales(@PathVariable int sales_id) {
//
//        try {
//            Sales sales = salesService.findbyId(sales_id);
//            if (sales == null) { //this is not work
//                throw new RuntimeException("Sales id not found" + sales_id);
//            }
//            return sales;
//
//        } catch (Exception e) {
//            System.out.println("error occurred" + e);
//            return null;
//        }
//    }
//
//    //add
//    @PostMapping("/sales")
//    public Sales addSales(@RequestBody Sales sales) {
//        //force to add object instead of update it.
//        sales.setSales_id(0);
//
//        Sales object = salesService.save(sales);
//        return object;
//    }
//
//    //update
//    @PutMapping("/sales")
//    public Sales updateSales(@RequestBody Sales sales) {
//
//        Sales object = salesService.save(sales);
//        return object;
//    }
//
//    //delete
//    @DeleteMapping("/sales/{sales_id}")
//    public String delete(@PathVariable int sales_id) {
//
//        Sales sales = salesService.findbyId(sales_id);
//
//        if(sales == null) {
//            throw new RuntimeException("employee id not found" + sales_id);
//
//        }
//        salesService.deletebyId(sales_id);
//        return "deleted success" + sales_id;
////        try {
////            Sales sales = salesService.findbyId(sales_id);
////            salesService.deletebyId(sales_id);
////            return  true;
////
////        } catch (RuntimeException e) {
////            System.out.println("run time error occurred" + e);
////            return false;
////        } catch (Exception e) {
////            System.out.println("error occurred" + e);
////            return false;
////        }
//
//    }
//
//
//}
