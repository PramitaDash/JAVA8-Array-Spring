package stream;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,4,5,6,7);
        int sum = num.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
