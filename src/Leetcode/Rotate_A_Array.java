package Leetcode;

import java.util.Arrays;

public class Rotate_A_Array {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int n=3;
        rotateArray(nums,n);

    }

    private static void rotateArray(int[] nums, int k) {
        // base condition
        if (nums.length==1 || k== nums.length || nums==null ) return;
        // if incase k is greater than the nums length
        if (nums.length<k){
            k= k% nums.length;
        }

        int firststart=0;
        int firstend= nums.length-1-k;
        int secondstart=firstend+1;
        //rotate a first half
        while (firststart<firstend){
            swap(nums,firststart,firstend);
            firststart++;
            firstend--;
        }
        // rotate  a second half
        int secondEnd= nums.length-1;
        while (secondstart<secondEnd){
            swap(nums,secondstart,secondEnd);
            secondstart++;
            secondEnd--;
        }
        //swap the all elemets
        int i=0;
        int j= nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int firststart, int firstend) {
        int temp=nums[firststart];
        nums[firststart]=nums[firstend];;
        nums[firstend]=temp;
    }
}
