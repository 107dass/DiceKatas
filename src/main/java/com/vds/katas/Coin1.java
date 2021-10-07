package com.vds.katas;

import java.util.Random;

public class Coin1 {

    public static final String HEAD = "Head";
    public static final String TAIL = "Tail";

    public Coin1() {
    }

    public String toss(Random random) {
        return (random.nextInt(2) == 0) ? HEAD : TAIL;
    }
}
