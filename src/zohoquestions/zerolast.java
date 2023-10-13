package zohoquestions;

import java.util.Arrays;
import java.util.Scanner;

public class zerolast {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE HOW MANY ELEMNTS YOU WANT ");
        int sizeofarry= scan.nextInt();
        int[] arr=new int[sizeofarry];
        for (int i=0;i<sizeofarry;i++){
            System.out.println("Enter the "+i+" th Element");
            arr[i]=scan.nextInt();
        }
        usingarray(arr);

    }
    private static void usingarray(int[] arr) {

       for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]==0 ){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
