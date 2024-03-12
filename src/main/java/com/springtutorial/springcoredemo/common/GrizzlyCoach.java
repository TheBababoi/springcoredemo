package com.springtutorial.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class GrizzlyCoach implements  Coach{

    public GrizzlyCoach() {
        System.out.println(getClass().getSimpleName() + " is in constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "You have to live it";
    }
}
