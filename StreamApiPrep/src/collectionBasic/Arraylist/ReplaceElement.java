package collectionBasic.Arraylist;

import java.util.ArrayList;

public class ReplaceElement {
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>(3);
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);

        System.out.println(list);
         list.set(2, 100);
        System.out.println(list);
    }
}
