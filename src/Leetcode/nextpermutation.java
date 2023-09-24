package Leetcode;

import java.util.Arrays;

public class nextpermutation {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,7,3,6,4,2};
        int[] answer = nextpermutationAnswer(arr);
        System.out.println(Arrays.toString(answer));

    }

    private static int[] nextpermutationAnswer(int[] arr) {
        // finding the position to change
        int i= arr.length-2;
        while (i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        // finding the j th position for swapping 
        int j= arr.length-1;
        if(i>0){
            while (j>i && arr[j]<=arr[i]){
                j--;
            }
        }
        /// we know the i th position and jth position so swap these elements 
        swap(arr, i, j);
        // after swapping the two elemts we need to sort the all elents after the i th position
        reverse(arr,i+1);
        return arr;
    }

    private static void reverse(int[] arr, int i) {
        int j= arr.length-1;
        while (i<j){
            swap(arr,i,j);
            i++;j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}