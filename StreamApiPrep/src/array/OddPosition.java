package array;

public class OddPosition {
    public static void main(String[] args) {
        int a[] = {9,3,2,4};
        for(int i=0;i<a.length;i+=2){
            System.out.println(a[i]);
        }
    }
}
