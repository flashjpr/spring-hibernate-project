package com.mihaifleseriu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by flash on 23/02/2017.
 */
public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // as deafult, beans are singleton so theCoach and alphaCoach should reference the same object
        Coach theCoach = ctx.getBean("kickboxCoach", Coach.class);
        Coach alphaCoach = ctx.getBean("kickboxCoach", Coach.class);

        // check if theCoach and alphaCoach are the same beans
        boolean result = (theCoach == alphaCoach);
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        ctx.close();
    }
}
