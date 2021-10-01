package com.vds.katas;

import java.util.Random;

public class Dice {

    private Random random;

    public Dice(Random random) {
        this.random = random;
    }

    public int roll() {
        return random.ints(1,7).findFirst().getAsInt();
    }
}
