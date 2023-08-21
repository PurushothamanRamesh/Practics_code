package strings;
//Write a Program to generate all possible substring of a string
public class AllSubstring {
    public static void main(String[] args) {
        String s=("Genartae");
        substrinng(s);
    }

    public static void substrinng(String s) {
        for (int i=0;i<s.length();i++){
            String str="";
            for (int j=i;j<s.length();j++){
                str+=s.charAt(j);
                System.out.println(str);
            }
        }
    }
}
