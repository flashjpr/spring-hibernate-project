package com.mihaifleseriu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by flash on 20/02/2017.
 */
public class SpringHelloApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = ctx.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        ctx.close();
    }
}
