package com.java.stream;
//Find Max and Min number using streams

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example7 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,34,78,9);
        Integer i = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(i);
        Integer i1 = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(i1);


    }
}
