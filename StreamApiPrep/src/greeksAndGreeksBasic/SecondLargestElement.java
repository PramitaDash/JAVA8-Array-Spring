package greeksAndGreeksBasic;

//secondLagestElemet
//ThirdLargestElement
//Three Great Candidiated
public class SecondLargestElement {

    public static void main(String[] args) {
        int a[] = {10, 3, 5, 6, 20};
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max =a[i];
            }
        }

        int secMax = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>secMax && a[i]<max){
                secMax=a[i];
            }
        }

        int thirdMAx = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>thirdMAx && a[i]<secMax){
                thirdMAx = a[i];
            }
        }

        System.out.println(thirdMAx);

        System.out.println(secMax);
        System.out.println(max * secMax * thirdMAx);
    }
}
