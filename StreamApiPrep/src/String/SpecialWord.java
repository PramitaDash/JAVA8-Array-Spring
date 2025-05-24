package String;

import java.util.Scanner;

public class SpecialWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String w="";
        s+=" ";

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!=' '){
                w =w+c;
            }
            else{
                char f = w.charAt(0);
                char l = w.charAt(w.length()-1);
                if(Character.toUpperCase(l) == Character.toUpperCase(f))
                    System.out.println(w);
                w="";
            }
        }
    }
}
