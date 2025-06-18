package collectionBasic.Arraylist;

import java.util.ArrayList;

public class TrimList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("original list" +list);
        list.trimToSize();
        System.out.println(list);
    }
}
