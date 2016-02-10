package com.swedbank;

/**
 * Created by p998ykk on 2016.02.09.
 */
public class Frame {
    private int firstRoll;
    private int secondRoll;

    public int getFirstRoll() {
        return firstRoll;
    }

    public void setFirstRoll(int firstRoll) {
        this.firstRoll = firstRoll;
    }

    public int getSecondRoll() {
        return secondRoll;
    }

    public void setSecondRoll(int secondRoll) {
        this.secondRoll = secondRoll;
    }

    @Override
    public String toString() {
        return firstRoll + " " + secondRoll;
    }
}
