package array;

public class DuplicateElements {
    public static void main(String[] args) {
        int a[] = {9,3,6,5,8,8,3,8};
        int temp =0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("sorting");
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();

        for(int i=0;i<a.length-1;i++){
            if(a[i] == a[i+1]){
                if(i == 0|| a[i] != a[i-1]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
