package rev;

import java.util.Arrays;
import java.util.List;

public class MapToIntSumExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,3,51,6);
        int sum = list.stream().mapToInt(e -> e * e).sum();
        System.out.println(sum);
    }
}
