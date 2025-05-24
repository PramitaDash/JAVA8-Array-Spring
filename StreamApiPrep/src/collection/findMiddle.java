package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findMiddle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int slow =0, fast =0;
        while(fast<list.size()-1){
            fast +=2;
            slow +=1;
        }
        System.out.println(list.get(slow));
    }
}
