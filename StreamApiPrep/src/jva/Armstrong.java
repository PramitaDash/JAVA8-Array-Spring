package jva;

public class Armstrong {
    public static void main(String[] args) {
        int og = 371;
        int p = 0, res = 0, sum = 0;
        int n = og;
        while (n != 0) {
            n = n / 10;
            p++;
        }
        n = og;
        while (n != 0) {
            int rev = n % 10;
            res = (int)  Math.pow(rev, p);
            sum = sum + res;
            n = n / 10;
        }

        if (sum == og) {
            System.out.println("Armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
