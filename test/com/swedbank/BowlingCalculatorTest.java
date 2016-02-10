package com.swedbank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingCalculatorTest {
    BowlingCalculator bowlingCalculator;
    @Before
    public void setUp() throws Exception
    {
        bowlingCalculator = new BowlingCalculator();
    }

    @Test
    public void rollingBall() throws Exception
    {
        bowlingCalculator.roll(3);
        bowlingCalculator.roll(5);
        assertEquals("Should be 3 5","[3 5]",bowlingCalculator.result);
    }

    @Test
    public void resultPrinting() throws Exception
    {
        Frame frame = new Frame();
        frame.setFirstRoll(1);
        frame.setSecondRoll(0);
        bowlingCalculator.result.add(frame);
        assertEquals("[1 0]", bowlingCalculator.getResult());
    }


}