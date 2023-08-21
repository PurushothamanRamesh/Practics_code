package Leetcode;

public class nextpermutation {
    public void permutation(int[] arr){
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }// finding the postition of i
        // we need to fine the grater value of i
        int j=arr.length-1;
        while(j>i){
            if (arr[i]<arr[j])
                break;
            else j--;
        }
        swap(arr,i,j);



    }

    public  void swap(int[] arr, int i, int j) {

    }

    public static void main(String[] args) {
        int[] arr={1,3,4,2,7,3,6,4,2};

    }
}