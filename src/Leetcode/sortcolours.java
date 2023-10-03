package Leetcode;

import java.util.Arrays;

public class sortcolours {
    public static void main(String[] args) {
        int[] nums={2,0,1};
        int[] arr=sortColors(nums);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sortColors(int[] nums) {
        int low=0,mid=0;
        int high= nums.length-1;
        while (mid<=high){
            if (nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            } else if (nums[mid]==1) {
                mid++;
            }else {
                //mid==0
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
        }
        return nums;

    }
}
