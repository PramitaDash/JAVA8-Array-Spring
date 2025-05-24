package array;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = new int[]{2,4,3,5,6};
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
