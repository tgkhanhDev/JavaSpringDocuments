package com.LearnJava5Days.utils;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    public BaseballCoach() {
        System.out.println("Create BaseballCoach: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice BASEBALL NOWWWW!!:D";
    }
}
