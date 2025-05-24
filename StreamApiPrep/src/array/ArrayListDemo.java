package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        String s[]= {"red","green","blue"};
        int a[] []= new int[][] {{1,2,3},{5,6,7}};
        System.out.println(Arrays.asList(s)); //it will not the premetive type element

        ArrayList<String> str = new ArrayList<>();
        Collections.addAll(str,s);
        System.out.println(str);

        for(String sr : s){
            str.add(sr);
        }
        System.out.println(str);

        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.deepToString(a));
        Arrays.asList(s).stream().forEach(c->System.out.println(c));
        Arrays.stream(s).forEach(System.out::println);

    }
}
