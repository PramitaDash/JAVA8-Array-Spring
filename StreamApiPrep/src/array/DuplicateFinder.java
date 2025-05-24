package array;

public class DuplicateFinder {
    public static void main(String[] args) {
        int a[] = {1,1,3,2,5,6,6,6};
        int max = a[0];

        for(int i=0;i<a.length;i++){
            if(max < a[i]){
                max = a[i];
            }
        }

        int count[] = new int[max +1];

        for(int i=0;i<a.length;i++){
            count[a[i]+1000]++;
        }

        System.out.println("Repeating element");
        for(int i=0;i<a.length;i++){

        }
    }
}
