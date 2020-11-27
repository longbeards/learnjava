package com.longbeards.practice;

import java.util.Arrays;
import java.util.List;

public class BitCounting {
    public int bitCounting(int number) {
        String binaryString = Integer.toBinaryString(number);
        List<String> strArray = Arrays.asList(binaryString.split(""));
        return (int) strArray.stream().filter(s -> s.equals("1")).count();
    }

    public int bitCount(int number) {
        return Integer.bitCount(number);
    }
}
