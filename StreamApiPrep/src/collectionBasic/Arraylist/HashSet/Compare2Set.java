package collectionBasic.Arraylist.HashSet;

import java.util.HashSet;

public class Compare2Set {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        HashSet<Integer> list2 = new HashSet<>();
        list2.add(10);
        list2.add(60);
        list2.add(20);
        list2.add(80);

        HashSet<String> resultSet = new HashSet<>();
        for(Integer e : list){
            resultSet.add(list2.contains(e)? "yes" : "no");
        }
        System.out.println(resultSet);
    }
}
