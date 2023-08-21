package strings;
public class aaabbbbccc {
    public static void main(String[] args) {
        String s="aaabbbbbccc";
        findsolution(s);
    }

    private static void findsolution(String s) {
        StringBuilder str= new StringBuilder();
        int index=0;
        while (index<s.length()){
            char curr=s.charAt(index);
            int count=1;
            index++;
            while (index<s.length() && s.charAt(index)==curr){
                count++;
                index++;
            }
            str.append(curr).append(count);
        }
        System.out.println(str.toString());
    }
}

