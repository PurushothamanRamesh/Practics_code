package zohoquestions;

public class Xpattern {
    public static void main(String[] args) {
        String s=("12345");
        pattern(s);
    }

    public  static void pattern(String s) {

        int n=s.length();
        int k=n-1;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if ( i+j==(n-1)) {
                    System.out.print(s.charAt(k)+" ");
                    k--;
                } else if (i==j )
                    System.out.print(s.charAt(i)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
