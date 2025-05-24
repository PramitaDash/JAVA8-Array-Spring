package array;

public class EvenPosition {
    public static void main(String[] args) {
        int a[] = {8,2,4,6};
        for(int i=1;i<a.length;i+=2){
            System.out.println(a[i]);
        }
    }
}
