package com.longbeards.practice;

import java.math.BigInteger;

public class TrailingZeros {
    public static int zeros(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <=n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        int count = 0;
        for (int i = 5; factorial.divide(BigInteger.valueOf(i)).compareTo(BigInteger.valueOf(1)) > 0; i *= 5) {
            count += n / i;
        }
        return count;
    }
}
