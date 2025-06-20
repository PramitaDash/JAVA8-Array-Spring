package collectionBasic.Arraylist.TreeSet;

import java.util.TreeSet;

public class AddElement {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(50);
        set1.add(60);
        set1.add(70);
        set1.add(80);

        set.addAll(set1);
        System.out.println(set1);
        System.out.println(set);


    }
}
