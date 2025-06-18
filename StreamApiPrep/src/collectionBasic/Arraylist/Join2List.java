package collectionBasic.Arraylist;

import java.util.ArrayList;

public class Join2List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(80);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.addAll(list1);
        System.out.println(list2);
    }
}
