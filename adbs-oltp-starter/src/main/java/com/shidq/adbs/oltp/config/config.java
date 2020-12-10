package com.shidq.adbs.oltp.config;


import com.shidq.adbs.oltp.core.filter.CustomFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    CustomFilter getCustomFilter(){
        CustomFilter customFilter = new CustomFilter();
        return customFilter;
    }


}
