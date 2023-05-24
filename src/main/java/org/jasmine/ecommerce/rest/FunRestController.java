//package org.jasmine.ecommerce.rest;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class FunRestController {
//
//    @Value("${admin.name}")
//    private String adminName;
//    @Value("${team.account}")
//    private String adminAccount;
//
//    @GetMapping("/")
//    public String hello() {
//        return "welcome";
//    }
//    @GetMapping("/workout")
//    public String workout() {
//        return "time to go gym";
//    }
//
//    @GetMapping("/adminInfo")
//    public String adminInfo() {
//        return "the account " + adminAccount + " is belongs to " + adminName;
//    }
//
//}
