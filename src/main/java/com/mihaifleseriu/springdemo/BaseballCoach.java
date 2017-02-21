package com.mihaifleseriu.springdemo;

/**
 * Created by flash on 20/02/2017.
 */
public class BaseballCoach  implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Baseball Coach : Do 20 minutes of threadmill and 20 minutes of Stair Stepper on your level";
    }
}
