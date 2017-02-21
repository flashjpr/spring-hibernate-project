package com.mihaifleseriu.springdemo;

/**
 * Created by flash on 21/02/2017.
 */
public class KickboxCoach implements Coach{

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Kickbox Coach : Start with 10 min skipping the rope, then kick and punch the bag for 1 minute with 30 seconds rest in between sets";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public KickboxCoach(){};

    public KickboxCoach (FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
}
