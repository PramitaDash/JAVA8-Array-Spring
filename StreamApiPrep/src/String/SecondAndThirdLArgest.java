package String;

import java.util.Scanner;
//DuplicateElements
//LeftRotation
public class SecondAndThirdLArgest {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        int n = 3;

        for(int i=0;i<n;i++){
            int last , j;
            last = a[a.length-1];
            for(j =a.length-1;j>0;j--){
                a[j] = a[j-1];
            }
            a[j] = last;

        }

        System.out.println("left roted");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
