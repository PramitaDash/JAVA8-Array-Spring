package com.java.stream;

import java.util.Arrays;
import java.util.List;
//square, extract greater then 9 , and then find avg

public class Example4 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(9,7,3,5,2);
        double sqr = list.stream().map(e -> e * e).filter(e -> e > 9).mapToInt(e -> e).average().getAsDouble();
        System.out.println(sqr);

    }
}
