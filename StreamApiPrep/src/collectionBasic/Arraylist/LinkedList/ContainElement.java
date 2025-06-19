package collectionBasic.Arraylist.LinkedList;

import java.util.LinkedList;

public class ContainElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        if(list.contains(10)){
            System.out.println("element is exists");
        }else{
            System.out.println("element is not exists");
        }
    }
}
