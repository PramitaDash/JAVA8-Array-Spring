package collectionBasic.Arraylist.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
