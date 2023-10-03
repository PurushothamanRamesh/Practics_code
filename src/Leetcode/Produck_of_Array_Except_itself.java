package Leetcode;

import java.util.Arrays;

public class Produck_of_Array_Except_itself {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        findtheProduct(nums);

    }

    private static void findtheProduct(int[] nums) {
        int left=1;
        int right=1;
        int[] result=new int[nums.length];
        for (int i=0;i< nums.length;i++){
            result[i]=left;
            left*=nums[i];
        }
        for (int i= nums.length-1;i>=0;i--){
            result[i]*=right;
            right*=nums[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
