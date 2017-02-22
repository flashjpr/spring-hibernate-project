package com.mihaifleseriu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by flash on 22/02/2017.
 */
public class SetterDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        CricketCoach cricketCoach = ctx.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getEmail());
        System.out.println(cricketCoach.getTeam());

        ctx.close();
    }
}
