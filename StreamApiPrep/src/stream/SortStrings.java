package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Pramita","Ananya","Shubra","Ariz");
        List<String> sort = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);
    }
}
