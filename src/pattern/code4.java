package pattern;
///   *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
public class code4 {

    public static void main(String[] args) {
        int n=9;
        //pattern(n);
        anothermethod(n);

    }
// || (j-i)==(n-1)/2  || i+j==(n-1)+(n-1)/2
    private static void anothermethod(int n) {
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if ( i+j>=(n-1)/2 ){
                    System.out.print("*");
                }else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }

    private static void pattern(int n) {
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
