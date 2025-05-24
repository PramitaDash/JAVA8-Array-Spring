package array;

public class LeftRotation {

    public static void main(String[] args) {
        int a[] = {8,3,6,5,4};
        int n = 3;

        for(int i=0;i<n;i++){
            int j, first;
            first=a[0];
            for(j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[j]=first;
        }

        System.out.println("print left rotation array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
