package com.java.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Even {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,5,3,5,6,7,8);
        List<Integer> even = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(even);
        List<Integer> odd = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
        System.out.println(odd);
    }
}
