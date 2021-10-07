package com.vds.katasv1;

import java.util.Random;

public interface RandomGenerator {

    default int fetch(Random random, int upperBound) {
        return random.nextInt(upperBound -1)+1;
    }
}
