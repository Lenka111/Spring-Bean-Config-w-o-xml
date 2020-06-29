package com.defineBeans;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    //fields
    private final FortuneService fortuneService;

    //inject properties from the file
    @Value("${email}")
    private String email;

    @Value("${team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100m meters ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
