package com.vds.katas;

import java.util.Random;

public class Coin1 {

    public static final String HEAD = "Head";
    public static final String TAIL = "Tail";

    private final Random random;

    public Coin1(Random random) {
        this.random = random;
    }

    public String toss() {
        return (random.nextInt(2) == 0) ? HEAD : TAIL;
    }
}
