package greeksAndGreeksBasic;

public class MoveAllZero {

    public static void main(String[] args) {
        int a[] = {1,2,0,0,4,0,5};
        int temp[] = new int[a.length];
        int j =0;

        for(int i=0;i<a.length;i++){
            if(a[i] !=0){
                temp[j++] = a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i] ==0){
                temp[j++] = a[i];
            }
        }

        for(int i=0;i<j;i++){
            a[i] = temp[i];
        }

        for(int i=0;i<j;i++){
            System.out.println(a[i]);
        }





    }
}
