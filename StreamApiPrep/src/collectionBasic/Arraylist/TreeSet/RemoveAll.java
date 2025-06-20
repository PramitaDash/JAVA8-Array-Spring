package collectionBasic.Arraylist.TreeSet;

import java.util.TreeSet;

public class RemoveAll {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

//        set.removeAll(set);
//        System.out.println(set);

        set.clear();
        System.out.println(set);
    }
}
