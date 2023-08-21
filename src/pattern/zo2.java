package pattern;
//                        1
//                       121
//                      12321
//                     1234321
//                    123454321
//                   12345654321
//                  1234567654321
//                 123456787654321
//                12345678987654321
public class zo2 {

    public static void main(String[] args) {
        int n=9;
        pattern(n);

    }
    private static void pattern(int n) {
        for (int i=9;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("  ");
            }
            for (int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            for (int j=i;j<n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
