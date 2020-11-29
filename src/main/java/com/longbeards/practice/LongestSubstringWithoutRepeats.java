package com.longbeards.practice;

import java.util.*;

public class LongestSubstringWithoutRepeats {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Set<String> stringSet = new HashSet<>(Arrays.asList(s.split("")));
        if (stringSet.size() == 1) {
            return 1;
        }
        int longestSubstringSize = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String tempStr = (s.substring(i, j));
                List<String> tempStrList = Arrays.asList(tempStr.split(""));
                Set<String> tempSets = new HashSet<>(tempStrList);
                if (tempStr.length() == tempSets.size() && tempStr.length() > longestSubstringSize) {
                    longestSubstringSize = tempStr.length();
                }
            }
        }
        return longestSubstringSize;
    }
}
