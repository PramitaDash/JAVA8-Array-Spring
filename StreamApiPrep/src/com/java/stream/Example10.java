package com.java.stream;
//Get second highest.lowest number using Streams

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,10,30,19,3);
        int secH = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(secH);

        int secHh = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secHh);

        int secL = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(secL);


    }
}
