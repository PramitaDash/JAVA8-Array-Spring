package collectionBasic.Arraylist.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for(Integer e : list){
            System.out.println(e);
        }

        Iterator<Integer> interor = list.iterator();
        while(interor.hasNext()){
            System.out.println(interor.next());
        }

        Iterator<Integer> integerIterator = list.iterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
