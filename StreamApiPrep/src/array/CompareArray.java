package array;

import java.util.Arrays;

public class CompareArray {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,6};
        int b[] = {7,8,9,6,4};

        boolean result = Arrays.equals(a, b);
        System.out.println(result);
    }

}
