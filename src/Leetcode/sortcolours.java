package Leetcode;

public class sortcolours {
    public static int[] sortColors(int[] nums) {
        int zeros=0;
        int ones=0;
        int two=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]==0) zeros++;
            else if(nums[j]==1) ones++;
            else two++;
            j++;
        }
        int m=0;

        for(int i=0;i<zeros;i++){
            nums[ m++]=0;

        }
        for(int i=zeros;i<=ones+zeros-1;i++){
            nums[ m++]=1;
        }
        for(int i=ones+zeros;i< nums.length;i++){
            if (m< nums.length)
              nums[ m++]=2;
        }
        return nums;


    }
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        int[] arr=sortColors(nums);
        for (int a:arr) {
            System.out.print(a+" ");
        }


    }
}
