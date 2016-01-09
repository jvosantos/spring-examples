package com.jvosantos.examples.services;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DynamicMessageOfTheDay implements MessageOfTheDayService {
    private final String[] messages = new String[] {
        "God creates the heavens and the earth. Speaks light into existence and separates light from the dark.",
        "God creates the sky, forming a barrier between water and air, thus giving an atmosphere to earth.",
        "God creates dry land, naming the bodies of water \"seas\" and the ground \"land\". Then he creates all plant life.",
        "God creates all the stars and heavenly bodies, including the sun.",
        "God creates all life that lives in the water and all the birds.",
        "God creates all creatures that live on dry land. God creates Man in his image.",
        "God rests after creating the universe in 6 days."
    };

    @Override
    public String getMessage() {
        final int day = GregorianCalendar.getInstance().get(Calendar.DAY_OF_WEEK);

        final String message = messages[day - 1];
        return message;
    }
}

