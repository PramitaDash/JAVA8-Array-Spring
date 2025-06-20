package collectionBasic.Arraylist.HashSet;

import java.util.HashSet;

public class RemoveAll {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.removeAll(list);
        System.out.println(list);
    }
}
