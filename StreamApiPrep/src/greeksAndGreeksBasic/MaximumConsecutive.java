package greeksAndGreeksBasic;

public class MaximumConsecutive {
    public static void main(String[] args) {
        int a[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int count = 0;
        int maxCount = 0;

        for(int i=0;i<a.length;i++){
            if(a[i] == 1){
                count++;
                maxCount = Math.max(maxCount,count);
            }else{
                count = 0;
            }
        }

        System.out.println(maxCount);

    }
}
