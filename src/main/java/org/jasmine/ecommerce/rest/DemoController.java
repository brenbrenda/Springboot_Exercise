package org.jasmine.ecommerce.rest;

import org.jasmine.ecommerce.practice.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private for dependency

    private Coach myCoach;
    @Autowired
    public DemoController(@Qualifier("tennisCustom") Coach coach) {
        System.out.println("In constructor" + getClass().getSimpleName());

        myCoach = coach;
    }



    @GetMapping("/dailywork")
    public String getDailyworkOut() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        //singelton -> true, prototype ->false
        return "Comparing beans: myCoach == anotherCoach," + (myCoach);
    }


}
