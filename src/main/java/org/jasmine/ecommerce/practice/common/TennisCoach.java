package org.jasmine.ecommerce.practice.common;

//@Component//mark the class as the bean
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practice at least 30 mins";
    }
}
