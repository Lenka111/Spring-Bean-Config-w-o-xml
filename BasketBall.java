package com.defineBeans;

public class BasketBall implements Coach{

    FortuneService fortuneService;
    //constructor
    public BasketBall(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Basketball one hour today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
