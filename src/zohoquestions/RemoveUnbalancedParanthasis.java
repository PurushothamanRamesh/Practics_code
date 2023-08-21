package zohoquestions;

import java.util.Queue;
import java.util.Stack;

public class RemoveUnbalancedParanthasis {
    public static void main(String[] args) {
       // String str="(((ab)";
       String str="((abc)(((de))";
        System.out.println(unbalance(str));
    }

    private static String unbalance(String str) {
        StringBuilder newstring=new StringBuilder(str);
        Stack<Integer> seen=new Stack<>();
        int index=0;
        while(index<str.length()){
            char ch=str.charAt(index);
            if (ch=='(')
                seen.add(index);
            else if(ch==')'){
                if (seen.isEmpty())
                    newstring.deleteCharAt(index);
                else
                    seen.pop();
            }
            index++;
        }
       while (!seen.isEmpty()){
           int value=seen.pop();
           newstring.deleteCharAt(value);
       }
       return newstring.toString();
    }
}
