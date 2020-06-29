package com.defineBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App1 {
    public static void main(String[] args) {

        //read the spring configuration java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //retrieve bean from spring container
        Coach theCoach = context.getBean("basketBallCoach", Coach.class);
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println("Email: "+swimCoach.getEmail());
        System.out.println("Team name: "+swimCoach.getTeam());

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
