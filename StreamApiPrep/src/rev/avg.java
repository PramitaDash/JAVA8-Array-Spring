package rev;

import java.util.Arrays;
import java.util.List;

public class avg {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,6,5,7);
        double asDouble = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(asDouble);
    }
}
