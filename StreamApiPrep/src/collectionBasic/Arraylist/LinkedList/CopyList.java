package collectionBasic.Arraylist.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class CopyList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);

        System.out.println(list1);
        System.out.println(list2);
        Collections.copy(list1,list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
