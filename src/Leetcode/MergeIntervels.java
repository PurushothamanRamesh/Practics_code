package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervels {
    public static void main(String[] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] answer = merging(intervals);
        System.out.println(Arrays.deepToString(answer));
    }

    private static int[][] merging(int[][] intervals) {
        List<int[] > list=new ArrayList<>();
        // if the array is sorted no problem otherwise we need to sort this array for that we need to
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int index=0;
        while (index<intervals.length){
            int newstart=intervals[index][0];
            int currend=intervals[index][1];
            while (index<intervals.length-1 && currend>=intervals[index+1][0]){
                currend=Math.max(currend,intervals[index+1][1]);
                index++;
            }
            int newend=currend;
            list.add(new int[]{newstart,newend});
            index++;
        }
        index=0;
        int[][] result=new int[list.size()][2];
        for (int[] arr:list) {
            result[index++]=arr;
        }
        return result;
    }
}
