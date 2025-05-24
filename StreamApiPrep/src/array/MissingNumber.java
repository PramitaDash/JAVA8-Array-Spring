package array;

public class MissingNumber {
    public static void main(String[] args) {
        int n =100;
        int a[] = new int[99];
        int index = 0;

        int missing = 57;
         for(int i=1;i<=n;i++){
             if(i!=missing){
                 a[index++] = i;
             }
         }

         int actualNumber = n *(n+1)/2;

         int actualSum =0;
         for(int i=0;i<index;i++){
             actualSum += a[i];
         }

         int missingNumber = actualNumber - actualSum;
        System.out.println(missingNumber);
    }
}
