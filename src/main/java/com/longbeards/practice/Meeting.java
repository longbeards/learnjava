package com.longbeards.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Meeting {

    static class User {
        private final String firstName;
        private final String lastName;

        User(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

    public static String meeting(String str) {
        List<User> userList = new ArrayList<>();
        Arrays.asList(str.split(";"))
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(s -> {
                    String[] names = s.split(":");
                    userList.add(new User(names[0], names[1]));
                });

        List<User> sortedList = userList
                .stream()
                .sorted(
                        Comparator.comparing(User::getLastName)
                                .thenComparing(User::getFirstName))
                .collect(Collectors.toList());

        StringBuilder stringBuilder = new StringBuilder();
        sortedList.forEach(s -> {
            stringBuilder.append("(").append(s.getLastName()).append(", ").append(s.getFirstName()).append(")");
        });

        return stringBuilder.toString();
    }

    public static String meetings(String s) {
        return Arrays.stream(s.toUpperCase().split(";"))
                .map(guest -> guest.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
                .sorted()
                .collect(Collectors.joining(""));
    }
}
