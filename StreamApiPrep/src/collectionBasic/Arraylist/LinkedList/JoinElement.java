package collectionBasic.Arraylist.LinkedList;

import java.util.LinkedList;

public class JoinElement {
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

        LinkedList<Integer> list = new LinkedList<>();
        list.addAll(list1);
        list.addAll(list2);
        System.out.println(list);
    }
}
