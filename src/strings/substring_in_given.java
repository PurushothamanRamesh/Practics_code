package strings;
//Write a Program to check whether a sub string is present in a given string
public class substring_in_given {
    public static void main(String[] args) {
        String s1=("hello");
        String s2=("hell");
        substring(s1,s2);

    }

    public  static void substring(String s1, String s2) {
        int i=0;
        int j=0;
        boolean flag=true;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(j) ){
                if ( j<s2.length()-1)
                    j++;
                else break;
            } else {
                flag=false;
            }
            i++;
        }
        if(flag) System.out.println("yes its a substring ");
        else System.out.println("no its not a substring ");

    }
}
