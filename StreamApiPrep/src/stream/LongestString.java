package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("apple", "banana", "cherry", "watermelon");
        Optional<String> loggest = names.stream()
                .max((s1, s2)->s1.length() - s2.length());
        loggest.ifPresent(System.out::println);
    }
}
