package rev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapToIntExample {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Alia", "Suchi", "Abhinab");
        IntStream intStream = name.stream().mapToInt(String::length);
        intStream.forEach(System.out::println);
    }

}
