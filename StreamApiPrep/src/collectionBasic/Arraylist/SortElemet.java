package collectionBasic.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortElemet {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        list.add("black");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
