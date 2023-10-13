package zohoquestions;

import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.Stack;

public class validparanthesis {
    public static void main(String[] args) {
        String s="[{()}{[()(){{}}]}]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack =new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='{'||ch=='['||ch=='(')
                stack.push(ch);
            else {
                if (stack.isEmpty())return false;
                if (ch==']'){
                    if (stack.peek()=='[')
                        stack.pop();
                    else
                        return false;
                }
                if (ch=='}'){
                    if (stack.peek()=='{')
                        stack.pop();
                    else
                        return false;
                }

                if (ch==')'){
                    if (stack.peek()=='(')
                        stack.pop();
                    else
                        return false;
                }
            }

        }


        if (stack.isEmpty())return true;
        else return false;

    }
}