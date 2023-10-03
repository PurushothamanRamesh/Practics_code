package Leetcode;

public class SubaraySumEqualToK {
    public static void main(String[] args) {
        int[] arr={1,1,3};
        int k=2;
        System.out.println(SubsumEQK(arr,k));

    }

    private static int SubsumEQK(int[] nums, int k) {
        int sum=0;
        int index=0;
        for (int i=0;i< nums.length;i++){
            sum+=nums[i];
            if (sum==k)
                return i+1-index;
            if (sum>k)
                sum-=nums[index++];
            if (sum<0)
                sum=0;
        }
        return -1;

    }
}
