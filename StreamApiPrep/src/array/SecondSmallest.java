package array;

public class SecondSmallest {
    public static void main(String[] args) {
        int a[] = {2,4,3,6,7,8};
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]) {
                min = a[i];
            }
        }

        int secMin = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<secMin && a[i]>min){
                secMin = a[i];
            }
        }
        System.out.println(secMin);
    }
}
