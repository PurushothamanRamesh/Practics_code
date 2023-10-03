package Leetcode;

public class SubArraySum {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        sumofSubarray(nums);

    }

    private static void sumofSubarray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if (sum<0)
                sum=0;
        }
        System.out.println(max);
    }
}
