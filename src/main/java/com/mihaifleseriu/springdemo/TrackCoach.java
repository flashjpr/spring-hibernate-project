package com.mihaifleseriu.springdemo;

/**
 * Created by flash on 20/02/2017.
 */
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Track Coach : Run on the threadmill with incline 15% for 20 minutes !";
    }
}
