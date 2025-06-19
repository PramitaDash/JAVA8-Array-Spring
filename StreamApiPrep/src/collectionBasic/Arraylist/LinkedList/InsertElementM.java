package collectionBasic.Arraylist.LinkedList;

import java.util.ArrayList;

public class InsertElementM {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ArrayList<Integer> addList = new ArrayList<>();
        addList.add(50);
        addList.add(60);

        list.addAll(2,addList);
        System.out.println(list);
    }
}
