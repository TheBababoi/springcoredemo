package com.springtutorial.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CardioCoach implements Coach{

    public CardioCoach() {
        System.out.println(getClass().getSimpleName() + " is in constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "10 more laps";
    }
}
