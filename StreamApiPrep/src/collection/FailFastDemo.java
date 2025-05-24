package collection;

import java.util.ArrayList;

public class FailFastDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("X");
        list.add("y");
        list.add("z");

        for(String s : list){
            System.out.println(s);
            list.add("N");
        }
    }
}
