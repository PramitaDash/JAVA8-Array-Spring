package collectionBasic.Arraylist;

import java.util.ArrayList;

public class PrintElementByPosition {
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>(3);
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);

            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
    }
}
