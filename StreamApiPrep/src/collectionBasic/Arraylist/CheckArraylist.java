package collectionBasic.Arraylist;

import java.util.ArrayList;

public class CheckArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        System.out.println(list.isEmpty());
        list.removeAll(list);
        System.out.println(list.isEmpty());
    }
}
