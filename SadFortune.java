package com.defineBeans;

public class SadFortune implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is not your day, try tomorrow";
    }
}
