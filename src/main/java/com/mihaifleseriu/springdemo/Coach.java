package com.mihaifleseriu.springdemo;

/**
 * Created by flash on 20/02/2017.
 */
public interface Coach {
    public String getDailyWorkout();
    public default String getDailyFortune(){
        return "";
    };
    public default int printNumber(){
        return 0;
    };
}
