package com.vds.katas;

import java.util.Random;

public class Dice {

    public static final int UPPER_BOUND = 7;
    private Random random;

    public Dice(Random random) {
        this.random = random;
    }

    public int roll() {
        return random.ints(1, UPPER_BOUND).findFirst().getAsInt();
    }
}
