package collectionBasic.Arraylist.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertToTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Set<Integer> treeSet = new TreeSet<>(list);
        System.out.println(treeSet);
    }
}
