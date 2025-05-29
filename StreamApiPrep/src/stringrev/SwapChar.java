package stringrev;

public class SwapChar {

    public static void main(String[] args) {
        String s = "ijioj jiroej fkowef";
        String w ="";
        String n ="";
        s+=" ";

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!=' '){
                w = w+c;
            }else{
                char f = w.charAt(0);
                char l = w.charAt(w.length()-1);
                String m = w.substring(1, w.length()-1);
                n = n+l+m+f+ " ";
                w = "";
            }
        }

        System.out.println(n);
    }
}
