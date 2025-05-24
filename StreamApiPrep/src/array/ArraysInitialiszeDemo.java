package array;

public class ArraysInitialiszeDemo {
    public static void main(String[] args) {
//        int a[] = {20,90,70,67}; //here we can create declare and initialize array
//
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }

        int a[]= new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println(a[2]);
    }
}
