package com.LearnJava5Days.utils;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach{

    //define init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In domyStartupStuff(): "+getClass().getSimpleName());
    }

    //define destroy method
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("In doMyCleanUpStufffffffffffffff(): "+ getClass().getSimpleName());
    }

    public TennisCoach() {
        System.out.println("Create TennisCoach"+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice Backhand Volley for 15minutes!";
    }
}
