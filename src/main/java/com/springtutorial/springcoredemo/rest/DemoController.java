package com.springtutorial.springcoredemo.rest;

import com.springtutorial.springcoredemo.common.Coach;
import com.springtutorial.springcoredemo.common.LiftingCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private field for the dependency
    private Coach coach;
    private Coach anotherCoach;

    //define a constructor for dependency injection


    //using Qualifier Annotation
    @Autowired  // when you have a single constructor the autowired annotation is optional
    public DemoController(@Qualifier("grizzlyCoach") Coach coach,
                          @Qualifier("liftingCoach") Coach anotherCoach) {
        System.out.println(getClass().getSimpleName() + " is in constructor");
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/check")
    public String check(){
        return  "Comparing beans: coach == anotherCoach " + (coach==anotherCoach);
    }

//    public DemoController(Coach coach) {
//        this.coach = coach;
//    }


//    @Autowired
//    public void setCoach(Coach coach){
//        this.coach = coach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}
