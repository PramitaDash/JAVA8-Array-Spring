package com.java.stream;
//Sort Number (ASC/DESC) using stream

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,10,30,19,3);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> descSorting = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(descSorting);
    }

}
