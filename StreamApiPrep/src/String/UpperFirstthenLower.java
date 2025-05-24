package String;

import java.util.Scanner;

public class UpperFirstthenLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String u = "";
        String l = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
                u = u+c;
            if(Character.isLowerCase(c))
                l = l+c;
        }

        System.out.println(u+l);
    }
}
