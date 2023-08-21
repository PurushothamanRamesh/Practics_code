package zohoquestions;

public class StringReversalRecursionLetterbyletter {
    public static void main(String[] args) {
        String input1 = "one two three";
        String reversed1 = reverseString(input1);
        System.out.println("Output 1: " + reversed1);

//        String input2 = "I love india";
//        String reversed2 = reverseString(input2);
//        System.out.println("Output 2: " + reversed2);
    }

    public static String reverseString(String str) {
       if (str.isEmpty()) return str;
       return reverseString(str.substring(1))+ str.charAt(0);
    }
}
