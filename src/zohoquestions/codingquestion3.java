package zohoquestions;

public class codingquestion3 {
    public static void main(String[] args) {
        int[] nums={4,1,-1,0,0,1,2,-1,4};
        System.out.println( sum(nums));
    }

    private static int sum(int[] nums) {

        for (int i=0;i< nums.length;i++){
                int j=0;
                boolean flag=true;
                while (j< nums.length){
                    if ( nums[i]==nums[j] && i!=j){
                        flag=false;
                        break;
                    }
                    j++;
                }
                if(flag==true){
                    return nums[i];
                }
        }
        return 0;
    }
}
