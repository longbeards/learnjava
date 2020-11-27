package com.longbeards.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class ArrayExamples {

    public int findNumberAppearingOddTimesInArray(int[] numArray) {
        Set<Integer> numSet = stream(numArray).boxed().collect(Collectors.toSet());
        int[][] counter = new int[numSet.size()][2];
        List<Integer> numList = new ArrayList<>(numSet);
        for (Integer num : numSet) {
            int count = 0;
            counter[numList.indexOf(num)][0] = num;
            for (Integer item : numArray) {
                if (num.equals(item)) {
                    count += 1;
                }
            }
            counter[numList.indexOf(num)][1] = count;
            if (count % 2 != 0) {
                return num;
            }
        }

        return 0;
    }

    public int findIt(int[] arr) {
        return stream(arr).reduce(0, (x, y) -> x ^ y);

    }
}
