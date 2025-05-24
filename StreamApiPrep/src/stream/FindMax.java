package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,3,5,3,5);
        Optional<Integer> max = num.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println);
    }
}
