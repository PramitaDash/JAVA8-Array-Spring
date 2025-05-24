package collection;

import java.util.LinkedList;

public class LinkedListPalindromeDemo {
    public static boolean isPalindrom(LinkedList<Integer> list){
        int left =0, right = list.size()-1;
        while(left < right){
            if(!list.get(left).equals (list.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(1);

        System.out.println(isPalindrom(list1));
    }
}
