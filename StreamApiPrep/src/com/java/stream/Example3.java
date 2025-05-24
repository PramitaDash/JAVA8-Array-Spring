package com.java.stream;
//Average of numbers

import java.util.Arrays;
import java.util.List;


public class Example3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,3,2);
        double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(avg);

    }

}
