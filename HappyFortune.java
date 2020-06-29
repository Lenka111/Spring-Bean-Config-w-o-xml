package com.defineBeans;

import org.springframework.stereotype.Component;

@Component("myFortuneService")
public class HappyFortune implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
