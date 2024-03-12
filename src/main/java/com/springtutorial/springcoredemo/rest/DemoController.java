package com.springtutorial.springcoredemo.rest;

import com.springtutorial.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private field for the dependency
    private Coach coach;

    //define a constructor for dependency injection

//    @Autowired  // when you have a single constructor the autowired annotation is optional
//    public DemoController(Coach coach) {
//        this.coach = coach;
//    }

    @Autowired
    public void setCoach(Coach coach){
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}
