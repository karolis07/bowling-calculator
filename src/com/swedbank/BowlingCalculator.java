package com.swedbank;


import java.util.ArrayList;
import java.util.List;

public class BowlingCalculator {
    public List<Frame> result = new ArrayList<Frame>();

    public void roll(int score) {
        int whichResult = result.size();
        if(score == 10)
        {
            Frame frame = new Frame();
            frame.setFirstRoll(10);
            frame.setSecondRoll(0);
            result.add(frame);
        }
        if(score < 10 && result.get(whichResult).getFirstRoll() >0)
        {
            result.get(whichResult).setSecondRoll(score);
        }
        else
        {
            Frame frame = new Frame();
            frame.setFirstRoll(score);
            result.add(frame);
        }
    }

    public String getResult() {
        return result.toString();
    }

}
