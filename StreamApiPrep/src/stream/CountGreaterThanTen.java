package stream;

import java.util.Arrays;
import java.util.List;

public class CountGreaterThanTen {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,4,3,5,1,12);
        long count = num.stream().filter(x-> x>10).count();
        System.out.println(count);
    }
}
