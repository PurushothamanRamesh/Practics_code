import java.util.Arrays;

public class roman {
    public static void main(String[] args) {
        int[] arr=new int[7];
        basics(arr);
        basics1(arr);
    }

    private static void basics1(int[] arr) {
        int n=2;
        for (int i=0;i<arr.length;i++){
            arr[i]=n;
            n=n+2;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void basics(int[] arr) {
        arr[6]=15;
        arr[3]=55;
        System.out.println(Arrays.toString(arr));
    }

}
