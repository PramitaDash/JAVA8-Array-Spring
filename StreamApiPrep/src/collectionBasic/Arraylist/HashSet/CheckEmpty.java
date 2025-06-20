package collectionBasic.Arraylist.HashSet;

import java.util.HashSet;

public class CheckEmpty {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }
}
