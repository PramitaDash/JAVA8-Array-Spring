package array;

import java.util.Scanner;

public class ArrayUserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the element: ");
            a[i]=sc.nextInt();
        }

        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}
