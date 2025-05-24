package rev;

import java.util.Arrays;
import java.util.List;

public class sum_of_all_num {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,4,3,6,7,8);
        Integer i = list.stream().reduce((a, b) -> a + b).get();
        System.out.println(i);
    }

}
