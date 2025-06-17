package collectionBasic.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArray {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);

        System.out.println(list2);

        Collections.copy(list1, list2);
        System.out.println(list2);
        System.out.println(list1);
    }
}
