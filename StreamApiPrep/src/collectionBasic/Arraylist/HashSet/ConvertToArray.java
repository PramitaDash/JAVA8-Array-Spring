package collectionBasic.Arraylist.HashSet;

import java.util.HashSet;

public class ConvertToArray {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Integer[] newArray = new Integer[list.size()];
        list.toArray(newArray);

        System.out.println("Array element");
        for(Integer e : list){
            System.out.println(e);
        }
    }
}
