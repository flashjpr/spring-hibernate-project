package com.mihaifleseriu.springdemo;

import java.util.Random;

/**
 * Created by flash on 22/02/2017.
 */
public class FortuneRandom implements FortuneService{

    private String[] fortunes = {"You will travel to many exotic places in your lifetime.",
                                 "Excellence is the difference between what I do and what I am capable of.",
                                 "Be a good friend and a fair enemy.",
                                 "Ignore previous fortunes.",
                                 "You will die alone and poorly dressed.",
                                 "A new pair of shoes will do you a world of good.",
                                 "The end is near ... and it's all your fault.",
                                 "Do you feel like you're walking in mud? Take your time today.",
                                 "Your students secretly agree that your head is too small for your body",};

    // return a new random fortune from the forutnes array
    @Override
    public String getFortune() {
        return fortunes[new Random().nextInt(fortunes.length)];
    }

}
