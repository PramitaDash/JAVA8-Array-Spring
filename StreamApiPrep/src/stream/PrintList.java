package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class PrintList {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");
        names.forEach(name-> System.out.println(name));
    }
}
