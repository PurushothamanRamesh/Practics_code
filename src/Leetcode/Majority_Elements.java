package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Majority_Elements {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int i=0;
        while(i<nums.length){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            else
                map.put(nums[i],1);
            i++;
        }
        int max=0;
        int key=0;
        for (Integer inte:map.keySet()) {
            if (map.get(inte)>max) {
                max=map.get(inte);
                key=inte;
            }
        }


        return key;
    }

    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));

    }

/*Map<Integer, Integer> countMap = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > majorityCount) {
                return num;
            }
        }

        return -1*/
}
