
package zohoquestions;

import java.util.Stack;

public class MathExpressionValidator {
    public static void main(String[] args) {
        String s = "(a+b)a  *n)";
        System.out.println(validate(s));
    }

    private static String validate(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        int index=0;
        while (index<ch.length){
            char chars=ch[index];
            if (chars == '(') {
                stack.push(chars);
            } else if (chars == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return "invalid";
                }
            } else if (chars == '+' || chars == '-' || chars == '*' || chars == '%' || chars == '/') {
                if (ch[index-1]>=65 && ch[index-1]<=90   || ch[index+1]>=97 && ch[index+1]<=122 ){}
                else return "invalid";
            }
            index++;
        }

        if (stack.isEmpty()) {
            return "valid";
        } else {
            return "invalid";
        }
    }
}
