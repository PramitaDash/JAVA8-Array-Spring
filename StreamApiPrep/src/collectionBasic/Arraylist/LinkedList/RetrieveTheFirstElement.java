package collectionBasic.Arraylist.LinkedList;

import java.util.LinkedList;

public class RetrieveTheFirstElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Integer firstElement = list.peekFirst();
        System.out.println(firstElement);
    }
}
