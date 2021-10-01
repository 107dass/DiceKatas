package com.vds.katas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;
import java.util.stream.IntStream;

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
//    @BeforeEach
//    void setup(){
//        MockitoAnnotations.initMocks(this);
//    }

    @Test
    public void returns_1_when_dice_is_rolled(){
        dice = new Dice(random);
        when(random.ints(1,7)).thenReturn(IntStream.of(1));

        int diceValue = dice.roll();

        assertEquals(1, diceValue);
    }

    @Test
    public void returns_6_when_dice_is_rolled(){
        dice = new Dice(random);
        when(random.ints(1,7)).thenReturn(IntStream.of(6));

        int diceValue = dice.roll();

        assertEquals(6, diceValue);
    }

    @Test
    public void returns_value_between_1_and_6_when_dice_is_rolled(){
        Random random = new Random();
        dice = new Dice(random);

        int diceValue = dice.roll();

        assertTrue(diceValue > 0);
        assertTrue(diceValue <= 6);
    }

}
