package zohoquestions;

public class StringWordReversalRecursionWords
{
    public static void main(String[] args) {
        String input1 = "the sky is blue";
        String reversed1 = reverseWords(input1);
        System.out.println("Output 1: " + reversed1);
    }

    public static String reverseWords(String str) {
      int index= str.indexOf(' ');
      if (index==-1) return str;
      return reverseWords(str.substring(index+1))+" "+str.substring(0,index);
    }
}
