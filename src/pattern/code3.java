package pattern;
//                                *
            //                  * *
                //            * * *
                //          * * * *
                //        * * * * *
public class code3 {

    public static void main(String[] args) {
        int n=5;
        pattern(n);

    }
    private static void pattern(int n) {
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
