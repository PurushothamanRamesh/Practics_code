package zohoquestions;

import java.util.Stack;

public class MathExpressionValidator {
    public static void main(String[] args) {
        String s="";
        validater(s);
    }

    private static String validater(String s) {
        char[] ch=s.toCharArray();
        int index=0;
        Stack<Character> stack=new Stack<>();
        while (index<ch.length){
            char character=ch[index];
            if (character=='(')
                stack.push(character);
            else if (character==')') {
                if (stack.peek()=='(')
                    stack.pop();
                else if (stack.isEmpty())
                    return "Invalid";
            }
            index++;
        }
        return "v";
    }
}
