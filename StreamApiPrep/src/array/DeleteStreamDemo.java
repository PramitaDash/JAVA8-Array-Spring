package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DeleteStreamDemo {

    public static void main(String[] args) {
//        int a[] ={1,2,3,4,5};
//        int index = 3;
//        int newArray[] = IntStream.range(0,a.length).filter(i->i!=index).toArray();
//        System.out.println(Arrays.toString(newArray));

        String s[] = {"red", "blue", "green"};
        List<String> c = new ArrayList<>(Arrays.asList(s));
        c.remove(2);
        c.remove("red");
        System.out.println(c);
    }
}
