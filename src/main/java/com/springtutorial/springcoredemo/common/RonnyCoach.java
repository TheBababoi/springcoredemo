package com.springtutorial.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class RonnyCoach implements Coach{

    public RonnyCoach() {
        System.out.println(getClass().getSimpleName() + " is in constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Ain't nothing to it but to do it";
    }
}
