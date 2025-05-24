package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(3,2,5,4,4,5,2);
        List<Integer> removeD = num.stream().distinct().collect(Collectors.toList());
        System.out.println(removeD);
    }
}
