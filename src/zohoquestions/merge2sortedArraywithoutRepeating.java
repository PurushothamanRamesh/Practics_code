package zohoquestions;

import java.util.TreeSet;

public class merge2sortedArraywithoutRepeating {
    public static void main(String[] args) {
        int[] arr1={ 2,4,5,6,7,9,10,13};
        int [] arr2={2,3,4,5,6,7,8,9,11,15};
       // sorting(arr1,arr2);
        // using a datastructure
        datastructure(arr1,arr2);
    }

    private static void datastructure(int[] arr1, int[] arr2) {
        TreeSet<Integer> set=new TreeSet<>((a,b)->b-a);
        for (int i:arr1) {
            set.add(i);
        }
        for (int i:arr2){
            set.add(i);
        }
        for (int i:set) {
            System.out.print(i+" ");
        }
    }

    private static void sorting(int[] arr1, int[] arr2) {
        int[] mergedarr=new int[arr1.length+ arr2.length];
        int i=0,j=0,k=0;
        while(i< arr1.length && j< arr2.length){
            if (arr1[i]<arr2[j])
                mergedarr[k++]=arr1[i++];
            else if (arr1[i]>arr2[j])
                mergedarr[k++]=arr2[j++];
            else {
                mergedarr[k++]=arr1[i++];
                j++;
            }
        }
        while (i<arr1.length)
            mergedarr[k++]=arr1[i++];
        while (j< arr2.length)
            mergedarr[k++]=arr2[j++];

        for (int value:mergedarr) {
            System.out.print(value+" ");
        }
    }
}
