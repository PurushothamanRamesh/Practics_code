package strings;
//Write a Program to calculate number of characters, vowels, consonants, words and white space in a string
public class

stringAnalyzer {
    public static void main(String[] args) {
        String s=("hello 12@world");
        analysinng(s);
    }
    public  static void analysinng(String s) {
        int i=0;
        int vowvels=0;
        int constant=0;
        int special=0;
        int digits=0;

        while(i<s.length()){
            char ch =s.charAt(i);
            ch=Character.toLowerCase(ch);
            if (ch>='a' && ch<='z' || ch>='A' && ch<='Z'){

                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    vowvels++;
                else 
                    constant++;
            } else if (ch>='0' && ch<='9') {
                digits++;
            }else special++;
            i++;
        }
        System.out.println("vowvels ------> "+vowvels);
        System.out.println("constant -----> "+constant);
        System.out.println("special-------> "+special);
        System.out.println("digits--------> "+digits);
    }
}

