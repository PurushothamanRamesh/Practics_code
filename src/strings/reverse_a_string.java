package strings;

public class reverse_a_string {
    public static void reverse(String s){
        String r="";
        int i=s.length()-1;
        while(i>=0){
            r+=s.charAt(i);
            i--;
        }
        System.out.println(r);
    }
    public static void main(String[] args) {
        String s=("hello world");
        reverse(s);
    }
}
