package strings;
/*
* Write a Program to print the ASCII values of all characters in a given string
*/

public class Ascii_value {
   public void  allchar(){
       char i='a';
       int k=0;
       int m=27;
       while(k<m)
       {
           System.out.println(i+" -->"+ (int)i);
           i++;
           k++;
       }

    }
    public static void main(String[] args) {
       String s=("Hello world");
       ascivalue(s);

    }

    public static void ascivalue(String s) {
       int i=0;
       while(i<s.length()){
           System.out.println(s.charAt(i) +" ---->"+(int)s.charAt(i));
           i++;
       }

    }
}
