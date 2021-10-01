package com.vds.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Dice1Test {

    //Simulate a dice throw using a dice() function. i.e. Generate random number between 1 and 6.

    Dice1 dice1 = new Dice1();

    @Test
    @RepeatedTest(6)
    public void generates_a_random_number_for_given_bound_limits(){
        int diceValue = dice1.roll();
        Assertions.assertTrue(diceValue > 0 && diceValue <= 6 );
    }

}
