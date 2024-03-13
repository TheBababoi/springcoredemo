package com.springtutorial.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class LiftingCoach implements  Coach{

    public LiftingCoach() {
        System.out.println(getClass().getSimpleName() + " is in constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Yeah Buddy";
    }
}
