package collectionBasic.Arraylist.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertToArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        List<Integer> convertArray = new ArrayList<Integer> (list);

        for(Integer e : convertArray){
            System.out.println(e);
        }
    }
}
