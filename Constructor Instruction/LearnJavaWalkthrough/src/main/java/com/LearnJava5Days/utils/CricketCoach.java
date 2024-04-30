package com.LearnJava5Days.utils;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("Create CricketCoach"+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15minutes!!:D";
    }
}
