package collection;

import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,1,3,2,5,7,8,9));
        Set<Integer> seen = new HashSet<>();
        Set<Integer> removeDup = new HashSet<>();

        for(Integer num : list){
            if(seen.add(num)){
                removeDup.add(num);
            }
        }

        System.out.println(removeDup);
    }
}
