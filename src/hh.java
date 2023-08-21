import java.util.HashSet;
import java.util.Set;

public class hh {
    public static void main(String[] args) {
        int  n = 3;
        int Arr[] = {1, 3,3};
        findTwoElement(Arr,n);

    }


   static int[] findTwoElement(int arr[], int n) {
        Set<Integer> seen=new HashSet<>();
        int i=0;
        int[] a=new int[2];

        while(i<n){
            if(seen.contains(arr[i])) a[0]=arr[i];
            else seen.add(arr[i]);
            i++;
        }
        int size=seen.size();
       // a[1]=;
        return a;
}
}