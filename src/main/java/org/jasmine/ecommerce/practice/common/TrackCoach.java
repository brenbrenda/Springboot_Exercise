package org.jasmine.ecommerce.practice.common;

import org.springframework.stereotype.Component;


@Component//mark the class as the bean

public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
