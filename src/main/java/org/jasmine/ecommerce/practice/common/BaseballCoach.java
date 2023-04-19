package org.jasmine.ecommerce.practice.common;

import org.springframework.stereotype.Component;

@Component//mark the class as the bean
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "play baseball every two weeks";
    }
}
