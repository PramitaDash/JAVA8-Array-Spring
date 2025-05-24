package com.java.stream;
//print number starts with prefix 2 using streams

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,222,234,567,890,432,236,211,22);
        List<Integer> number = list.stream().map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2"))
                .map(Integer::valueOf).collect(Collectors.toList());

        System.out.println(number);
    }
}
