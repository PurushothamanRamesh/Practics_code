package Leetcode;

public class Greatest_Common_Divisor_of_Strings {
    public static void main(String[] args) {
        String s1="ABA";
        String s2="ABAB";
        System.out.println( Gcdfinder(s1,s2));
    }

    private static String Gcdfinder(String str1, String str2) {
//        int n1=s1.length();
//        int n2=s2.length();
//        if(!(s1+s2==s2+s1))
//            return "";
//        return Gcdfinder(s1.substring(s2.length()), s2);
        if (str1.length() < str2.length()) { // make sure str1 is not shorter than str2.
            return Gcdfinder(str2, str1);
        }else if (!str1.startsWith(str2)) { // shorter string is not common prefix.
            return "";
        }else if (str2.isEmpty()) { // gcd string found.
            return str1;
        }else { // cut off the common prefix part of str1.
            return Gcdfinder(str1.substring(str2.length()), str2);
        }
    }
}
