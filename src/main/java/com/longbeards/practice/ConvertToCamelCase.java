package com.longbeards.practice;

import java.util.Arrays;
import java.util.List;

public class ConvertToCamelCase {

    public String convertToCamelCase_mapReduce(String str) {
        String[] strArray = str.split("_|-");
        return Arrays.stream(strArray, 1, strArray.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(strArray[0], String::concat);
    }

    public String convertToCamelCase_forEach(String str) {
        List<String> strList = Arrays.asList(str.split("_|-"));
        StringBuilder stringBuilder = new StringBuilder().append(strList.get(0));
        strList.stream().filter(s -> strList.indexOf(s) != 0)
                .forEach(s -> stringBuilder.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)));
        return stringBuilder.toString();
    }
}
