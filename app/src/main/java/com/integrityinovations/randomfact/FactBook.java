package com.integrityinovations.randomfact;

import java.util.Random;

/**
 * Created by jamesyothers on 11/5/15.
 */
public class FactBook {

    // Member variable (properties about the ovject)
    public static String[] mFacts = {"Ants stretch when they wake up in the morning.",
            "Ostrtichres can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth",
            "Some bamboo plants can grow almost a meter in just one day",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Treehouse is not actually in a tree."};

    // Method (abilities: things the object can do)
    public static String getFact() {

        String fact;

        // randomly select a fact
        // construct a new random number generator
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;

    }
}
