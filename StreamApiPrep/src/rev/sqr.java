package rev;

import java.util.Arrays;
import java.util.List;

public class sqr {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,3,1,5);
        double asDouble = list.stream().map(e -> e * e).mapToInt(e -> e).average().getAsDouble();
        System.out.println(asDouble);
    }
}
