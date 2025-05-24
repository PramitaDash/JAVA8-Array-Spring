package array;

public class FirstNonRepeatingElement {

    public static void main(String[] args) {
        int a[] = {2,3,3,5,-1,9,2};
       int count[] = new int[2001];

       for(int i=0;i<a.length;i++){
           count[a[i]+1000]++;
       }

       int firstNonRepeating = -1;
       for(int i=0;i<a.length;i++){
           if(count[a[i]+1000] == 1){
               firstNonRepeating = a[i];
               break;
           }
       }

       if(firstNonRepeating != -1){
           System.out.println("first non repeating element "+ firstNonRepeating);
       }else{
           System.out.println("not found");
       }
    }
}
