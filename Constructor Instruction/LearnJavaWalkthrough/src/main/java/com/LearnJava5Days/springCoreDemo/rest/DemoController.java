package com.LearnJava5Days.springCoreDemo.rest;

import com.LearnJava5Days.utils.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for the dependency
    private Coach myCoach;
//    private Coach anotherCoach;
    //Define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach
//    @Qualifier("tennisCoach") Coach theCoach1
    ){
        myCoach= theCoach;
//        anotherCoach= theCoach1;
    }
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach= theCoach;
//    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return  myCoach.getDailyWorkOut();
    }

//    @GetMapping("/check")
//    public String check(){
//        return "Comparing bean: myCoach - AnotherCoach: "+ (myCoach == anotherCoach);
//    }

}
