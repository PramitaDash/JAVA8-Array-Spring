package collectionBasic.Arraylist;

import java.util.ArrayList;

public class Compare2List {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        ArrayList<String> list3 = new ArrayList<>();
        for(Integer e : list2){
            list3.add(list1.contains(e)? "yes":"no");
        }
        System.out.println(list3);

        ArrayList<Boolean> list4 = new ArrayList<>();
        for(Integer ee : list2){
            list4.add(list1.contains(ee));
        }
        System.out.println(list4);
    }
}
