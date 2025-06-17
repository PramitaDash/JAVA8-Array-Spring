package collectionBasic.Arraylist;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        list.add("black");

        if (list.contains("yellow")){
            System.out.println("found the element");
        }else{
            System.out.println("not found the element");
        }
    }
}
