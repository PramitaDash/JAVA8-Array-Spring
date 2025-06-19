package collectionBasic.Arraylist.LinkedList;

import java.util.LinkedList;

public class RemoveElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.pop();
        System.out.println(list);
    }
}
