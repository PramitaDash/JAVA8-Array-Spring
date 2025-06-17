package collectionBasic.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for(Integer l : list){
            System.out.println(l);
        }
        System.out.println();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        ListIterator<Integer> literator = list.listIterator();
        while (literator.hasNext()){
            System.out.println(literator.next());
        }
        System.out.println();
        ListIterator<Integer> Piterator = list.listIterator();
        while (Piterator.hasPrevious()){
            System.out.println(Piterator.previous());
        }
    }
}
