package greeksAndGreeksBasic;

public class ReverseAnGroupArray {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int k=3;
        for(int i=0;i<a.length;i+=k){
            int left = i;
            int right = Math.min(i+k-1,a.length-1);
            while (left<right){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
