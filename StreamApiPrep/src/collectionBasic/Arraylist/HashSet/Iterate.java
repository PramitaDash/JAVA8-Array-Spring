package collectionBasic.Arraylist.HashSet;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;

public class Iterate {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
//        list.add(40);
        System.out.println(list);

        Iterator<Integer> p = list.iterator();
        while (p.hasNext()){
            System.out.println(p.next());
        }
    }
}
