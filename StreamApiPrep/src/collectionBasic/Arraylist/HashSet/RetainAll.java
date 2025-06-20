package collectionBasic.Arraylist.HashSet;

import java.util.HashSet;

public class RetainAll {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        HashSet<Integer> list1 = new HashSet<>();
        list.add(10);
        list.add(60);
        list.add(30);
        list.add(50);

        list.retainAll(list1);
        System.out.println(list1);
        System.out.println(list);
    }
}
