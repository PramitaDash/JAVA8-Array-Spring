package com.java.stream;
//Get/ignore first 5 numbers using Limit & skip in streams
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,10,30,19,3);
        List<Integer> l = list.stream().limit(5).collect(Collectors.toList());
        System.out.println(l);

        Integer sum = list.stream().limit(5).reduce((a, b) -> a + b).get();
        System.out.println(sum);

//       skip

        List<Integer> sk = list.stream().skip(5).collect(Collectors.toList());
        System.out.println(sk);

        Integer sumsk = list.stream().skip(5).reduce((a, b) -> a + b).get();
        System.out.println(sumsk);

    }

}
