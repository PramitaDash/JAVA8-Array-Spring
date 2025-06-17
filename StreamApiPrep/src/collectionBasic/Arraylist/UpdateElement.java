package collectionBasic.Arraylist;

import java.util.ArrayList;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.set(1, 80);
        System.out.println(list.get(1));
    }
}
