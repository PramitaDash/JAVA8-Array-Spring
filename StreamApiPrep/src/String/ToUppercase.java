package String;

import java.util.Scanner;
//count number of R in a string
public class ToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char ch = Character.toUpperCase(c);
            if(ch == 'R'){
                count++;
            }
        }
        System.out.println(count);
    }
}
