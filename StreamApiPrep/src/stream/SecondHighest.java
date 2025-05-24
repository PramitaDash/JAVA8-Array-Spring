package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,5,6,4,7,8);
        Optional<Integer> sec = num.stream()
                .sorted((a,b)->b-a)
                .skip(1)
                .findFirst();

        sec.ifPresent(System.out::println);
    }
}
