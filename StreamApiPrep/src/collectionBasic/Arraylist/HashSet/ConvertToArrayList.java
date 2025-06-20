package collectionBasic.Arraylist.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ConvertToArrayList {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        List<Integer> newList = new ArrayList<>(list);
        System.out.println(newList);
    }
}
