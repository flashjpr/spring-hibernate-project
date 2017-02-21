package com.mihaifleseriu.springdemo;

/**
 * Created by flash on 21/02/2017.
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private int number;
    public CricketCoach() {}

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public int printNumber() {
        return number;
    }
}
