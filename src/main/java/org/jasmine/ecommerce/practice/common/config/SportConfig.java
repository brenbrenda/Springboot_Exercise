package org.jasmine.ecommerce.practice.common.config;

import org.jasmine.ecommerce.practice.common.Coach;
import org.jasmine.ecommerce.practice.common.TennisCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("tennisCustom")
    public Coach tennisCoach() {
        return new TennisCoach();
    }

}
