package com.vds.katasv1;


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
    private Random random;

    @Test
    public void displayHeadWhenCoinIsTossed(){
        coin = new Coin();
        when(random.nextInt(1)).thenReturn(1);

        String displayValue = coin.toss(random);

        assertEquals("Head", displayValue);
    }

    @Test
    public void displayTailWhenCoinIsTossed(){
        coin = new Coin();
        when(random.nextInt(1)).thenReturn(0);

        String displayValue = coin.toss(random);

        assertEquals("Tail", displayValue);
    }

    @Test
    @RepeatedTest(10)
    public void displayEitherHeadOrTailWhenCoinIsTossed(){
        coin = new Coin();
        Random random = new Random();

        String displayValue = coin.toss(random);

        System.out.println(displayValue);
        assertTrue(displayValue.equals("Head") || displayValue.equals("Tail"));
    }
}
