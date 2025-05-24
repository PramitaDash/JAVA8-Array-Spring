package stream;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "apple", "cherry", "banana");

        Map<String, Long> duplicate = names.stream()
                .collect(Collectors.groupingBy(name->name, Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(duplicate);
    }
}
