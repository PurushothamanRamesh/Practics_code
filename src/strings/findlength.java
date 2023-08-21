package strings;
//Write a Program to find the length of the given string without using strlen
public class findlength {
    public static void main(String[] args) {
        String s=("        Iam brute          ");
        length(s);

    }

    public  static void length(String s) {
        String s1=s.trim();
        int count=0;
        for (int i=0;i<s1.length();i++){
            count++;
        }
        System.out.println(" the length is "+count);

    }
}
