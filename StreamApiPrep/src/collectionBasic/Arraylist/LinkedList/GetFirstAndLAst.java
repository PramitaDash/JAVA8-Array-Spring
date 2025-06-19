package collectionBasic.Arraylist.LinkedList;

import java.util.LinkedList;

public class GetFirstAndLAst {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
