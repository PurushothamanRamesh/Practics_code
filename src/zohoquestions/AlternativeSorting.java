package zohoquestions;
//    The Question is Alternate sorting: Given an array of integers, rearrange the array in such a way that the first
//            element is first maximum and second element is first minimum. Input : {1, 2, 3, 4, 5, 6, 7}
//            Output : {7, 1, 6, 2, 5, 3, 4}

import java.util.Arrays;

public class AlternativeSorting {
    public static void main(String[] args) {
        int[] nums= {1, 2, 3, 4, 5, 6, 7};
        sorting2(nums);


    }

    private static void sorting(int[] nums) {
        int index=0;
        int i=0;
        int j= nums.length-1;
        int []  temp=new int[nums.length];
        while(i<=j){
            temp[index++]=nums[j--];
            if (i<=j)
               temp[index++]=nums[i++];
        }
        for(int value:temp){
            System.out.print(value+" ");
        }
    }
    private static void sorting2(int[] nums) {
        int index=0;
        int i=0;
        int j= nums.length-1;
        while(i<=j){
            int first=nums[index];
            int last=nums[j--];
            nums[index++]=last;
            if (i<=j)
                nums[index++]=first;
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
