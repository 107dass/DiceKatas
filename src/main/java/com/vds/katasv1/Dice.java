package com.vds.katasv1;

import java.util.Random;

public class Dice implements RandomGenerator {

    public static final int UPPER_BOUND = 7;

    public Dice() {
    }

    public int roll(Random random) {
        return fetch(random, UPPER_BOUND);
    }

}
