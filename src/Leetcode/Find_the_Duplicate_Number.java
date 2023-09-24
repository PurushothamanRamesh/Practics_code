package Leetcode;

public class Find_the_Duplicate_Number {
    public static void main(String[] args) {
        //int[]  nums ={1,3,4,2,2};
        int[]  nums ={2,5,9,6,9,3,8,9,7,1};

        finddublicate(nums);
    }

    private static void finddublicate(int[] nums) {
        // its like a linked list cycle for a better time complxity
        int slow=nums[0];
        int fast=nums[0];
        do {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while (slow!=fast);
//        slow=nums[0];
//        int index=0;
//        while (slow!=fast){
//            slow=nums[index++];
//            if (index== nums.length) {
//                break;
//            }
//        }
        System.out.println(slow);
        System.out.println(fast);
    }
}
