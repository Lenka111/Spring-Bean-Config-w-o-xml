package com.defineBeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortune implements FortuneService{

    String[] randomFortunes = {"You Rock", "Study Hard", " Your Wish Is Coming True", "Don't Give Up!"};
    Random rand = new Random();

    @Override
    public String getFortune() {
        List list = new ArrayList<>(Arrays.asList(randomFortunes));
        return String.valueOf(list.get(rand.nextInt(list.size())));

    }
}
