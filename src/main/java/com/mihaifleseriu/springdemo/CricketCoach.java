package com.mihaifleseriu.springdemo;

/**
 * Created by flash on 21/02/2017.
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;


    private String email;
    private String team;

    public void setTeam(String team) {
        this.team = team;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return "Cricket Coach email: " + email;
    }
    public String getTeam() {
        return "Cricket Team: " + team;
    }


    public CricketCoach() {
        System.out.println("Cricket Coach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach: inside setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket Coach Workout: Practice fast fawling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return "Cricket Coach Fortune: " + fortuneService.getFortune();
    }

}
