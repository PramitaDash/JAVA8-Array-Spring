package collection;
//Q: Reverse an ArrayList<Integer> without using Collections.reverse().

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,1,4,6,7,8));
        List<Integer> reverse = new ArrayList<>();

        for(int i =list.size()-1;i>=0;i--){
            reverse.add(list.get(i));
        }

        System.out.println(list);
        System.out.println(reverse);


    }

}
