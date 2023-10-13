package zohoquestions;

import java.util.Scanner;

public class repeatElementandSort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE HOW MANY ELEMNTS YOU WANT ");
        int sizeofarry= scan.nextInt();
        int[] arr=new int[sizeofarry];
        for (int i=0;i<sizeofarry;i++){
            System.out.println("Enter the "+i+" th Element");
            arr[i]=scan.nextInt();
        }
        findrepeatingelemt(arr);

    }

    private static void findrepeatingelemt(int[] arr) {
        int [] val=new int[arr.length];
        int index=0;
        int count=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    val[index++]=arr[j];
                }
            }
        }
        // sorting order
        for (int i=0;i<count;i++){
            for (int j=i+1;j<count;j++){
               if(val[i]>val[j]){
                   int temv=val[j];
                   val[j]=val[i];
                   val[i]=temv;
               }
            }
        }
        for (int i:val) {
            if (i!=0)
            System.out.println(i);
        }
    }

}