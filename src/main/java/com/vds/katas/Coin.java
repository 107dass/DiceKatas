package com.vds.katas;

public class Coin {

    public static final String HEAD = "Head";
    public static final String TAIL = "Tail";

    public String toss(Dice dice) {
        return dice.roll() % 2 == 0 ? HEAD : TAIL;
    }
}
