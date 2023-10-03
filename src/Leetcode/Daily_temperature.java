package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Daily_temperature {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        dailytemp(temperatures);
    }

    private static void dailytemp(int[] temperatures) {
        int n= temperatures.length;
        int[] result=new int[n];
        Stack<Integer> helperstack=new Stack<>();
        for (int i=n-1;i>=0;i--){
            // check if the greater elements present or not
            while (!helperstack.isEmpty() && temperatures[i]>=temperatures[helperstack.peek()]){
                helperstack.pop();
            }
            // after removing the elements in a stack if stcak has a element find out the index range
            if(!helperstack.empty()){
                result[i]=helperstack.peek()-i;
            }
            // inserting the current index
            helperstack.push(i);
        }
        System.out.println(Arrays.toString(result));

    }
}
