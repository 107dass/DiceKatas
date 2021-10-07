package com.vds.katasv1;

import java.util.Random;

public class Coin implements RandomGenerator{

    public static final String HEAD = "Head";
    public static final String TAIL = "Tail";
    public static final int UPPER_BOUND = 2;

    public String toss(Random random) {
        var randomNumber = fetch(random, UPPER_BOUND);
        return randomNumber % 2 == 0 ? HEAD : TAIL;
    }

}
