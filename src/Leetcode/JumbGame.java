package Leetcode;

public class JumbGame {
    public static void main(String[] args) {
        int num[]={2,3,1,0,4};
        boolean b = canJumb(num);
        System.out.println(b);
    }

    private static boolean canJumb(int[] num) {
        // [1,1,1,2,5,2,1,0,0,1,3]
        int finalposition= num.length-1;
        for (int index= num.length-2;index>=0;index--){
            if(index+num[index]>=finalposition){
                finalposition=index;
            }
        }
        return finalposition==0;
    }
}
