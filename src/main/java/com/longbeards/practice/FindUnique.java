package com.longbeards.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUnique {
    public static double findUniq(double[] arr) {
        // Not sure why this came to mind!
        List<Double> doubles = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        if (doubles.get(0).equals(doubles.get(1))) {
            return doubles.get(doubles.size() - 1);
        } else {
            return doubles.get(0);
        }
    }

    public static double findUniqArr(double[] arr) {
        // Way simpler!
        Arrays.sort(arr);
        return arr[0] != arr[1] ? arr[0] : arr[arr.length - 1];
    }
}
