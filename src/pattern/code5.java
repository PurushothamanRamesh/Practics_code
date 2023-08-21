package pattern;

public class code5 {
    public static void main(String[] args) {
        int n=14;
       // pattern(n);
      //  anothermethod(n);
        anotry(n);
    }

    private static void anotry(int n) {
        int m=n/2 ,k=m,z=1,x=m;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (z==m) break;
                if ( i+j<=(n-1) && i<=(n-1)/2  && j>=i  ||  i+j>=(n-1) && i>=(n-1)/2  && j<=i   )
                    System.out.print(k--+" ");
                else
                    System.out.print(" ");
            }
            if(z!=m)
                System.out.println();
            k=m;
            if (z<m) k-=z++;
            else{
                ++z;
                k-=--x;
            }
        }
    }

    private static void anothermethod(int n) {
        int m=n;
        int k=1;

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i<=j)
                    System.out.print(m--+" ");
                else
                    System.out.print("@");
            }
            m=n;
            System.out.println();
            m-=k++;
        }

    }

    private static void pattern(int n) {
        for (int i=n;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
