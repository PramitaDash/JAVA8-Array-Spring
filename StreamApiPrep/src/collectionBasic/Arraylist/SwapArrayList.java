package collectionBasic.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("original list");
        for(Integer e : list){
            System.out.println(e);
        }

        Collections.swap(list, 0, 4);
        System.out.println("after swap");
        for(Integer e1 : list){
            System.out.println(e1);
        }
    }
}
