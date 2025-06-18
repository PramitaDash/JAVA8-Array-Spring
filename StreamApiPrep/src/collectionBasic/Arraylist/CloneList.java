package collectionBasic.Arraylist;

import java.util.ArrayList;

public class CloneList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("original array" +list);

        ArrayList<Integer> cloneList = (ArrayList<Integer>) list.clone();
        System.out.println(cloneList);
    }
}
