package jva;

public class Palindrom {
    public static void main(String[] args) {
        int n = 122;
        int a =n;
        int sum =0;
        while(a!=0){
            int rev = a %10;
            sum = sum * 10+rev;
            a = a /10;
        }

        if(sum == n ){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }
}
