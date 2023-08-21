package snippet;

public class one {
    public static void main(String[] args) {
        int nums[] ={1,2,3};
        int nums1[]= {1,2,3,4,5};
        nums1=nums;
        for (int i:nums) {
            System.out.println(i);

        }
    }
}
