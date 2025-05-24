package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareList {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,1,4);
        List<Integer> square = num.stream().map(n->n*n).collect(Collectors.toList()
        );
        System.out.println(square);
    }
}
