package zohoquestions;

public class OddDecendingEvenAcending {
    public static void main(String[] args) {
        int[]  arr={1,2,3,4,5,6,7,8,9};
        sorting(arr);
    }

    private static void sorting(int[] arr) {
        // for an odd decending order
        for (int i=0;i< arr.length;i+=2){
            for (int j=i+2;j< arr.length;j+=2){
                if (arr[i] <arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        // for an Even decending order
        for (int i=1;i< arr.length;i+=2){
            for (int j=i+2;j< arr.length;j+=2){
                if (arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int a:arr) {
            System.out.print(a+" ");
        }



    }
}
