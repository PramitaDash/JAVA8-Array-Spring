package array;

public class CopyArray {

    public static void main(String[] args) {
        int a[] = new int[]{1,4,3,2};
        int b[] = new int[a.length];

        for (int i=0;i<a.length;i++){
            b[i] = a[i];
        }

        System.out.println("Print the copy array");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
