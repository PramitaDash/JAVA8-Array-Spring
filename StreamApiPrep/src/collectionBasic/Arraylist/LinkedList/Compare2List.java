package collectionBasic.Arraylist.LinkedList;

import java.util.LinkedList;

public class Compare2List {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(90);
        list2.add(40);
        list2.add(50);

        LinkedList<String> list = new LinkedList<>();
        for(Integer e : list1){
            list.add(list2.contains(e)?"yes" : "no");
        }
        System.out.println(list);
    }
}
