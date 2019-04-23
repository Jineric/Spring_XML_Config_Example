package com.jineric.Spring_XLM_Config_Example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringBeanExampleApplication {
    public static void main(String[] args) {
//
//        SpringApplication.run(SpringBeanExampleApplication.class, args);
//
//        Coach theCoach = new TrackCoach();
//
//        System.out.println(theCoach.getDailyWorkout());

        /* construction injection
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        context.close();
        */

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}