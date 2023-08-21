package pattern;
//        * * * * * * * * *
//         * * * * * * * *
//          * * * * * * *
//           * * * * * *
//            * * * * *
//             * * * *
//              * * *
//               * *
//                *

public class zo4 {

    public static void main(String[] args) {
        int n=9;
        pattern(n);

    }
    private static void pattern(int n) {
        for (int i=n;i>0;i--){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
            for (int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
