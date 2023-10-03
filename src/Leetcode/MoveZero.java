package Leetcode;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        Movezero(nums);
    }

    private static void Movezero(int[] nums) {
        int j=0;
        int i=0;
        while (i<nums.length){
            if (nums[i]!=0){
                int temp= nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
