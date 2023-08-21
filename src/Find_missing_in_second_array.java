import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Find_missing_in_second_array {
   static ArrayList<Long> findMissing(long A[], long B[], int N, int M)
        {
            Set<Long> seen=new HashSet<>();
            for (long a:A){
                seen.add(a);
            }
            ArrayList<Long> arr=new ArrayList<>();

            int i=0;
            while (i<B.length){
                if (seen.contains(B[i])){
                    seen.remove(B[i]);
                }else {
                    seen.add(B[i]);
                }
                i++;
            }
            for (long a:seen){
                arr.add(a);
            }

            return arr;
        }

    public static void main(String[] args) {
        int N = 6, M = 5;
      long  A[] = {4, 3, 5, 9, 11};
      long  B[] = {4, 9, 3, 11, 10};
//        long A[] = {1, 2, 3, 4, 5, 10};
//        long B[] = {2, 3, 1, 0, 5};
        System.out.println( findMissing(A,B,N,M));

    }
}
