package org.jasmine.ecommerce.practice.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component//mark the class as the bean

public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("in constructor" + getClass().getSimpleName());

    }

    @PostConstruct
    public void doMyStartup() {
        System.out.println("dostart"+getClass().getSimpleName());
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practice coding an apple a day keeps a doctor away:)";
    }
}
