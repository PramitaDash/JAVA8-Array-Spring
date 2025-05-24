package array;

public class LargestElement_array {
    public static void main(String[] args) {
        int a[]={99,70,7,8};
        int max = a[0];

        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
