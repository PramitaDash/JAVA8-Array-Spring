package collectionBasic.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Sublist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        List<Integer> sublist = list.subList(0,3);
        System.out.println(sublist);
    }
}
