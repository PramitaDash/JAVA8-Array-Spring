package collectionBasic.Arraylist.TreeSet;

import java.util.TreeSet;

public class Compare2Set {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(20);
        set1.add(30);
        set1.add(60);
        set1.add(70);

        for(Integer e : set){
            if(set1.contains(e)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
