// Spring container configuration  with java code
package com.defineBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//scan the package and find all the classes that have @component and register them in the spring container
//@ComponentScan("com.defineBeans")
@PropertySource("classpath:sports.properties")
@PropertySource("classpath:basketball.properties")

public class SportConfig {

    //the @Bean tells Spring that we are creating a bean component manually
    @Bean
    public FortuneService sadFortune(){
        return new SadFortune();
    }
    @Bean FortuneService randomFortune(){
        return new RandomFortune();
    }

    @Bean
    //the method name determines the bean id
    public Coach swimCoach(){
        //SwimCoach mySwimCoach = new SwimCoach(sadFortune());
        //create a new instance of SwimCoach and return it
        //the instance will only be created once during the initial bean creation since the scope is singleton
        return new SwimCoach(sadFortune());
    }
    @Bean
    public Coach basketBallCoach(){
        return new BasketBall(randomFortune());

    }
}
