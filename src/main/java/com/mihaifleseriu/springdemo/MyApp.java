package com.mihaifleseriu.springdemo;

/**
 * Created by flash on 20/02/2017.
 */
public class MyApp {
    public static void main(String[] args) {

        // create the object
        Coach baseballCoach = new BaseballCoach();
        Coach trackCoach = new TrackCoach();

        // use the object
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());
    }
}
