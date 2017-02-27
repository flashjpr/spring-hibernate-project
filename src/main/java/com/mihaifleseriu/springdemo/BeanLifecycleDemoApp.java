package com.mihaifleseriu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by flash on 23/02/2017.
 */
public class BeanLifecycleDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        // as deafult, beans are singleton so theCoach and alphaCoach should reference the same object
        Coach theCoach = ctx.getBean("kickboxCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());

        ctx.close();
    }
}
