package strings;
//Write a Program to print the characters at even and odd positions of a string

public class EvenAndOddPosition {
    public static void main(String[] args) {
        String s=("helloworld");
        evenandOdd(s);
    }

    public  static void evenandOdd(String s) {
        System.out.println("odd position");
        for (int i=0;i<s.length();i+=2){

            System.out.print(s.charAt(i)+" ");
        }
        System.out.println("even position");
        for (int i=1;i<s.length();i+=2){
            System.out.print(s.charAt(i)+" ");
        }
    }
}
