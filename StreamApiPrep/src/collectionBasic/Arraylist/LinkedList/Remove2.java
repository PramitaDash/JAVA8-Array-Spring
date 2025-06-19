package collectionBasic.Arraylist.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Remove2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.remove(3);
        System.out.println(list);
    }
}
