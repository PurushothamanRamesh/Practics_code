package Leetcode;

import java.util.*;

public class _3_Sum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    private static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set=new HashSet<>();
        // base condition
        if(nums.length<3|| nums==null) return new ArrayList<>();
        // iterating the element
        Arrays.sort(nums);
        for (int i=0;i< nums.length-2;i++){
            int left=i+1;
            int right= nums.length-1;
            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if (sum==0){
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                } else if (sum<0) {
                    left++;
                }else
                    right--;
            }
        }

        return new ArrayList<>(set);
    }
}
