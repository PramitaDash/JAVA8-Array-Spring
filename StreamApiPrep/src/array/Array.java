package array;

public class Array {

    public static void main(String[] args) {
        int a[] = {1,1,2,2,4,6,7};
        int n = a.length;
        int temp[] = new int[n];
        int j=0;

        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[n-1];

        for(int i=0;i<j;i++){
            a[i] = temp[i];
        }

        System.out.println("after removing duplicate array");
        for (int i=0;i<j;i++){
            System.out.println(a[i]);
        }
    }

}
