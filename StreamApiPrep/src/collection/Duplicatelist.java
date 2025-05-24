package collection;
//Q: Print duplicate elements in a List<Integer>.

import java.util.*;

public class Duplicatelist {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,5,6,4,2,1,1,3,6));

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for(Integer num : list){
            if(!seen.add(num)){
                duplicate.add(num);
            }
        }

        System.out.println(duplicate);
    }

}
