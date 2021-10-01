package com.vds.katas;

import java.util.Random;

public class Coin {

    public static final String HEAD = "Head";
    public static final String TAIL = "Tail";
    private final Dice dice;

    public Coin(Dice dice) {
        this.dice = dice;
    }

    public String toss() {
        return dice.roll() % 2 == 0 ? HEAD : TAIL;
    }
}
