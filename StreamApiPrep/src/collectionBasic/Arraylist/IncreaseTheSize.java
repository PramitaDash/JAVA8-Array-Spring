package collectionBasic.Arraylist;

import java.util.ArrayList;

public class IncreaseTheSize {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        list.ensureCapacity(6);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        System.out.println(list);

        ArrayList<String> c1= new ArrayList<String>(3);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        System.out.println("Original array list: " + c1);

        c1.ensureCapacity(6);
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");
        System.out.println("New array list: " + c1);
    }
}
