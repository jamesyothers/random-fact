package com.integrityinovations.randomfact;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by jamesyothers on 11/9/15.
 */
public class ColorWheel {

    // Member variable (properties about the ovject)
    public static String[] mColors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };

    // Method (abilities: things the object can do)
    public static int getColor() {

        String color;

        // randomly select a fact
        // construct a new random number generator
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];

        return Color.parseColor(color);

    }
}
