package pattern;

//           *
//           * *
//           * * *
//           * * * *
//           * * * * *
public class code1 {

    public static void main(String[] args) {
        int n=5;
        //pattern(n);
        anothermethod(n);

    }

    private static void anothermethod(int n) {
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                if (i>=j )
                    System.out.print("*");
                else
                    System.out.print("");
            }
            System.out.println();
        }
    }

    private static void pattern(int n) {
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
