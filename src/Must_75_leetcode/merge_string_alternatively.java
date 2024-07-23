package Must_75_leetcode;

public class merge_string_alternatively {

    public static void main(String[] args) {
        String word1="ab";
        String word2="pqrs";
        String answer =stringAlter(word1,word2);
        System.out.println("The alternative string is "+ answer);
    }
    private static String stringAlter(String word1, String word2) {
        String ans="";
        int p1=0;
        int p2=0;
        int length=word1.length()+word2.length();
        while(length>0){
            if(p1<word1.length()){
                ans=ans+word1.charAt(p1);
                p1++;
            }
            if(p2<word2.length()){
                ans=ans+word2.charAt(p2);
                p2++;
            }
            length--;
        }
        return ans;
    }

}
