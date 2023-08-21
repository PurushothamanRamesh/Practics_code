package zohoquestions;

public class Substring {
    public static void main(String[] args) {
        String s1="test123string";
        String s2="123";
        System.out.println(sub(s1,s2));
        System.out.println(methodtwo(s1,s2));
    }

    private static int methodtwo(String s1, String s2) {
        int value=s1.indexOf(s2);
        return value;
    }

    private static int sub(String s1, String s2) {
        int j=0;
        for (int i=0;i<s1.length();i++){
                for (j=0;j<s2.length();j++){
                    if (s1.charAt(i+j)!=s2.charAt(j)) break;
                }
                if (j==s2.length()) return i;
        }
        return -1;
    }
}
