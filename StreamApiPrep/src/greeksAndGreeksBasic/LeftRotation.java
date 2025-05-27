package greeksAndGreeksBasic;

public class LeftRotation {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int n =2;

        for(int i=0;i<n;i++){
            int j, first;
            first = a[0];
            for(j=0;j<a.length-1;j++){
                a[j] = a[j+1];
            }
            a[j] =first;
        }

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
