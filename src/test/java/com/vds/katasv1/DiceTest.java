package com.vds.katasv1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DiceTest {

    @InjectMocks
    Dice dice;

    @Mock
    Random random;

    //Arrange/Mock - Act - Assert/Verify

    @Test
    public void throws_1_when_dice_is_rolled() {
        dice = new Dice();
        when(random.nextInt(6)).thenReturn(0);
        int diceValue = dice.roll(random);

        assertEquals(1, diceValue);
    }

    @Test
    public void throws_6_when_dice_is_rolled() {
        dice = new Dice();
        when(random.nextInt(6)).thenReturn(5);

        int diceValue = dice.roll(random);

        assertEquals(6, diceValue);
    }

    @Test
    public void throws_value_between_1_and_6_when_dice_is_rolled() {
        Random random = new Random();
        dice = new Dice();

        int diceValue = dice.roll(random);

        assertTrue(diceValue > 0);
        assertTrue(diceValue <= 6);
    }

}
