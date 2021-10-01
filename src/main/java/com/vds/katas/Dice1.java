package com.vds.katas;

import java.util.Random;

public class Dice1 {

    public int roll() {
        return new Random().ints(1, 7).findFirst().getAsInt();
    }
}