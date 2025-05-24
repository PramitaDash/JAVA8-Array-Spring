package array;

public class SecondAndThirdLArgest {

    public static void main(String[] args) {
        int a[] = {1,6,4,7,3,6,6};
        int max = a[0];

        for(int i=0;i< a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }

        int secMAx = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>secMAx && a[i]<max){
                secMAx=a[i];
            }
        }

        int ThirdMax = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>ThirdMax && a[i]<secMAx){
                ThirdMax = a[i];
            }
        }

        System.out.println(secMAx);
        System.out.println(ThirdMax);
    }
}
