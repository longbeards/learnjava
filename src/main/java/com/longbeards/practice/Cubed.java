package com.longbeards.practice;

public class Cubed {

    public long findNb(long m) {
        long counter = 1;
        while (m > 0) {
            m -= (counter * counter * counter);
            counter++;
        }

        if (m == 0) {
            return counter - 1;
        }
        return -1;
    }
}
