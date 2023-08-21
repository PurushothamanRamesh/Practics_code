package strings;
//Write a Program to compare two strings without using library function(strcmp)
public class comapre_two_string {
    public static void main(String[] args) {
        String s1=("Hello");
        String s2=("Hello");
        check(s1,s2);

    }

    public  static void check(String s1, String s2) {
        int n=s1.length()+s2.length();
        boolean flag=true;
        for (int i=0;i<n;i++){
            if(s1.charAt(0)!=s2.charAt(0)){
                flag=false;
                break;
            }
        }
        if(flag) System.out.println(" Given String is same");
        else System.out.println("Given String is not same ");
    }
}
