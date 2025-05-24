package array;
//java program to check whether an element is present in two arrays in given 3 arrays
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayPresent {
    public static void main(String[] args) {
        Integer a[]= {1,3,2,5,7,5};
        Integer b[]= {9,7,3,1,5,6};
        Integer c[]= {1,3,5,89,78};

        HashSet<Integer> h = new HashSet<>();
        List<Integer> l1 = Arrays.asList(a);
        List<Integer> l2=Arrays.asList(b);
        List<Integer> l3=Arrays.asList(c);
        h.addAll(l1);
        h.addAll(l2);
        h.addAll(l3);
        List<Integer> newList = new ArrayList<>();
        for(Integer num: h){
            if((l1.contains(num) && l2.contains(num)) ||
                    (l2.contains(num) && l3.contains(num))
                    ||(l3.contains(num) && l1.contains(num))){

                    newList.add(num);
            }
        }

        System.out.println(newList);
    }
}
