package com.vds.katas;


import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

//Write a toss() function that returns "head" or "tail" as strings.
@ExtendWith(MockitoExtension.class)
public class CoinTest {

    @InjectMocks
    private Coin coin;

    @Mock
    private Dice dice;

    @Test
    public void displayHeadWhenCoinIsTossed(){
        coin = new Coin(dice);
        when(dice.roll()).thenReturn(2);

        String displayValue = coin.toss();

        assertEquals("Head", displayValue);
    }

    @Test
    public void displayTailWhenCoinIsTossed(){
        coin = new Coin(dice);
        when(dice.roll()).thenReturn(3);

        String displayValue = coin.toss();

        assertEquals("Tail", displayValue);
    }

    @Test
    @RepeatedTest(10)
    public void displayEitherHeadOrTailWhenCoinIsTossed(){
        coin = new Coin(new Dice(new Random()));

        String displayValue = coin.toss();
        System.out.println(displayValue);
        assertTrue(displayValue.equals("Head") || displayValue.equals("Tail"));
    }
}
