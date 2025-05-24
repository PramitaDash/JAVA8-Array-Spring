package stream;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello";
        String reverce = s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                             return list.stream()
                                    .map(String::valueOf)
                                    .collect(Collectors.joining());
                        }
                ));
        System.out.println(reverce);
    }
}
