package com.springtutorial.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class GrizzlyCoach implements  Coach{

    //dedine init method
    @PostConstruct
    public void doStartupStuff(){
        System.out.println("In doStartupStuff(): " +getClass().getSimpleName());
    }

    //define destroy method
    @PreDestroy
    public void doCleanupStuff(){
        System.out.println("In doCleanupStuff(): " +getClass().getSimpleName());
    }

    public GrizzlyCoach() {
        System.out.println(getClass().getSimpleName() + " is in constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "You have to live it";
    }
}
