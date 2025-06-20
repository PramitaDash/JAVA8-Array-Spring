package collectionBasic.Arraylist.TreeSet;

import java.util.TreeSet;

public class PollFirst {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set.pollFirst());
    }
}
