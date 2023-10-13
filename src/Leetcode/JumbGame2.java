package Leetcode;

public class JumbGame2 {
    public static void main(String[] args) {
        int num[]={2,3,1,1,4};
        int i = mimJumbii(num);
        System.out.println(i);
        int jump = jump(num);
        System.out.println(jump);
        System.out.println(jumpgame(num));

    }

    private static int mimJumbii(int[] num) {
        int destination= num.length-1;
        int totalJums=0;
        int coverage=0;
        int lastJumpIndex=0;
        for (int i=0;i< num.length;i++){
            coverage=Math.max(coverage, i+num[i]);
            if (i==lastJumpIndex){
                totalJums++;
                lastJumpIndex=coverage;
                if (coverage>=destination){
                    return totalJums;
                }
            }
        }
        return totalJums;
    }
    public static int jump(int[] A) {
        int noOfJums = 0;
        int lastJumpIndex = 0;
        int max = 0;
        for(int i=0; i<A.length-1; i++) {
            max = Math.max(max, i+A[i]);
            if( i == lastJumpIndex) {
                noOfJums++;
                lastJumpIndex= max;
            }
        }
        return noOfJums;
    }
    public static int jumpgame(int[] nums) {
        int totalJumps = 0;
        // destination is last index
        int destination = nums.length - 1;
        int coverage = 0, lastJumpIdx = 0;
        // Base case
        if (nums.length == 1) return 0;
        // Greedy strategy: extend coverage as long as possible
        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);
            if (i == lastJumpIdx) {
                lastJumpIdx = coverage;
                totalJumps++;
                // check if we reached destination already
                if (coverage >= destination) {
                    return totalJumps;
                }
            }
        }

        return totalJumps;
    }

}
