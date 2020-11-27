package com.longbeards.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class AreTheySame {

    public Boolean areArraysSame(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return Boolean.FALSE;
        }
        List<Integer> aList = stream(a).boxed().collect(Collectors.toList());
        List<Integer> bList = stream(b).boxed().collect(Collectors.toList());
        aList.sort(Comparator.comparingInt(Math::abs));
        bList.sort(Comparator.comparingInt(Math::abs));

        for (int i = 0; i < a.length; i++) {
            if (aList.get(i) * aList.get(i) != bList.get(i)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public Boolean areArraysSameB(int[] a, int[] b) {
        if (a == null || b == null) {
            return Boolean.FALSE;
        }
        int[] aSquare = stream(a).map(s -> s * s).toArray();

        Arrays.sort(b);
        Arrays.sort(aSquare);

        return Arrays.equals(aSquare, b);
    }
}
