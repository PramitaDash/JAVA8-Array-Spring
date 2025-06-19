package collectionBasic.Arraylist.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverceIterator {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator p = list.descendingIterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
}
