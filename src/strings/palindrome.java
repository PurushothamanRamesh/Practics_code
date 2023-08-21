package strings;

public class palindrome {
    public static void main(String[] args) {
        String s=("geeg");
        palindrom(s);
    }

   public static void palindrom(String s) {
        int i=s.length()-1;
        String s1="";
        while(i>=0){
            s1+=s.charAt(i);
            i--;
        }
        if (s.equals(s1)) System.out.println("given string is Palindrom ");
        else System.out.println("Given string is not polindrom ");
    }
}
