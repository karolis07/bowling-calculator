package com.swedbank;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by p998ykk on 2016.02.09.
 */
public class FrameTest {

    @Test
    public void frameExists()
    {
        Frame frame = new Frame();
        frame.setFirstRoll(0);
        frame.setSecondRoll(0);
        assertEquals("0 0",frame.toString());
    }

}