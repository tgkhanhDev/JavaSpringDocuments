package com.LearnJava5Days.utils;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("Construct SwimCoach: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Swim 1000 meters as a warmUp. ";
    }
}
