package com.java.stream;
//print Duplicate Number using Streams

import java.util.*;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,1,2,2,10,30,19,3);
//        Set<Integer> dup = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
//        System.out.println(dup);

        Set<Integer> dupNum = new HashSet<Integer>();
        Set<Integer> dup = list.stream().filter(e -> !dupNum.add(e)).collect(Collectors.toSet());
        System.out.println(dup);


    }
}
