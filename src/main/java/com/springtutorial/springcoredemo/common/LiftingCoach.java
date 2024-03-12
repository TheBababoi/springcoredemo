package com.springtutorial.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class LiftingCoach implements  Coach{
    @Override
    public String getDailyWorkout() {
        return "Yeah Buddy";
    }
}
