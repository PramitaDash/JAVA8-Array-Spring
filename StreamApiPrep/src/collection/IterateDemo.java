package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(90);
        list.add(70);

        System.out.println("using foreach loop");
        for(Integer num : list){
            System.out.println(num);
        }

        System.out.println("using iterator");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
