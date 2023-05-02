package org.jasmine.ecommerce.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymleafDemo {

    @GetMapping("/time")
    public String time(Model model) {
        //singelton -> true, prototype ->false
        model.addAttribute("theDate", new java.util.Date());
        return "datetime";

    }
}
