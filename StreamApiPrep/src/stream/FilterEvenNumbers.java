package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,4,5);
        List<Integer> even = num.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(even);
    }
}
